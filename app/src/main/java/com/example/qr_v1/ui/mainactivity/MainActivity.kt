package com.example.qr_v1.ui.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.qr_v1.R
import com.example.qr_v1.db.database.QrResultDatabase
import com.example.qr_v1.db.entities.QrResult
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewPagerAdapter()
        setBottomNavigation()
        setViewPagerListener()

        val qrResult = QrResult(result = "Dummy Text", resultTYpe = "TEXT", favourite = false,calendar = Calendar.getInstance())

        QrResultDatabase.getAppDatabase(this)?.getQRDao()?.insertQrResult(qrResult)
    }


    private fun setBottomNavigation() {
        bottomNavigationView.setOnNavigationItemSelectedListener {

           viewPager.currentItem = when(it.itemId){
               R.id.scanMenuId -> 0
               R.id.recentscanMenuId -> 1
               R.id.favouritesMenuId -> 2
               else -> 0
           }
            return@setOnNavigationItemSelectedListener true
        }
    }

    private fun setViewPagerAdapter() {
        viewPager.adapter = MainPagerAdapter(supportFragmentManager)
    }

    private fun setViewPagerListener() {
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                bottomNavigationView.selectedItemId = when(position){
                    0 -> R.id.scanMenuId
                    1 -> R.id.recentscanMenuId
                    2 -> R.id.favouritesMenuId
                    else -> R.id.scanMenuId
                }
            }

        })
    }
}
