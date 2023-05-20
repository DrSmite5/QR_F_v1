package com.example.qr_v1.ui.mainactivity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.qr_v1.ui.scanned_history.ScannedHistoryFragment
import com.example.qr_v1.ui.scanner.QrScannerFragment

class MainPagerAdapter(var fm : FragmentManager) : FragmentStatePagerAdapter(fm){


    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> QrScannerFragment.newInstance()
            1 -> ScannedHistoryFragment.newInstance(ScannedHistoryFragment.ResultListType.ALL_RESULT)
            2 -> ScannedHistoryFragment.newInstance(ScannedHistoryFragment.ResultListType.FAVOURITE_RESULT)
            else -> QrScannerFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 3
    }


}