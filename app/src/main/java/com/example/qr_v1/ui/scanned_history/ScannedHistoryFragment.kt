package com.example.qr_v1.ui.scanned_history

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.qr_v1.R
import com.example.qr_v1.db.DBHelper
import com.example.qr_v1.db.DBHelperI
import com.example.qr_v1.db.database.QrResultDatabase
import com.example.qr_v1.db.entities.QrResult
import com.example.qr_v1.ui.adapters.ScannedResultListAdapter
import com.example.qr_v1.ui.utils.gone
import com.example.qr_v1.ui.utils.visible
import kotlinx.android.synthetic.main.fragment_scanned_history.view.*
import kotlinx.android.synthetic.main.layout_header_history.view.*

class ScannedHistoryFragment : Fragment() {

    enum class ResultListType {
        ALL_RESULT, FAVOURITE_RESULT
    }

    companion object {

        private const val ARGUMENT_RESULT_LIST_TYPE = "ArgumentResultListType"

        fun newInstance(screenType : ResultListType) : ScannedHistoryFragment{
            val bundle = Bundle()
            bundle.putSerializable(ARGUMENT_RESULT_LIST_TYPE, screenType)
            val fragment = ScannedHistoryFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    private lateinit var resultType : ResultListType

    private lateinit var mView : View

    private lateinit var dbHelperI: DBHelperI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handleArguments()
    }

    private fun handleArguments() {
        resultType = arguments!!.getSerializable(ARGUMENT_RESULT_LIST_TYPE) as ResultListType
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater.inflate(R.layout.fragment_scanned_history, container, false)
        init()
        showListOfResults()
        setSwipeRefreshLayout()
        onClicks()
        return mView
    }

    private fun onClicks() {
        mView.removeAll.setOnClickListener {
            showRemoveAllScannedResultDialog()
        }
    }

    private fun showRemoveAllScannedResultDialog() {
        AlertDialog.Builder(context,R.style.CustomAlertDialog)
            .setTitle("Delete all")
            .setMessage("Delete all QR?")
            .setPositiveButton("Delete"){ dialog, which ->
                clearRecords()
            }
            .setNegativeButton("Cancel"){dialog, which ->
                dialog.cancel()
            }.show()
    }

    private fun clearRecords() {
        when(resultType){
            ResultListType.ALL_RESULT -> dbHelperI.deleteAllQrScannedResults()
            ResultListType.FAVOURITE_RESULT -> dbHelperI.deleteAllFavouriteQrScannedResults()
        }
        mView.scannedHistoryRecyclerView?.adapter?.notifyDataSetChanged()
        showAllResults()
    }

    private fun setSwipeRefreshLayout() {
        mView.swipeRefresh.setOnRefreshListener {
            mView.swipeRefresh.isRefreshing = false
            showListOfResults()
        }
    }

    private fun init() {
        dbHelperI = DBHelper(QrResultDatabase.getAppDatabase(context!!)!!)
    }

    private fun showListOfResults() {
        when(resultType){
            ResultListType.ALL_RESULT -> {
                showAllResults()
            }
            ResultListType.FAVOURITE_RESULT -> {
                showFavouriteResults()
            }
        }
    }

    private fun showAllResults() {
        val listOfAllResult = dbHelperI.getAllQrScannedResult()
        showResults(listOfAllResult)
        mView.tvHeaderText.text = "History"
    }

    private fun showFavouriteResults() {
        val listOfFavouriteResult = dbHelperI.getAllFavouriteQrScannedResult()
        showResults(listOfFavouriteResult)
        mView.tvHeaderText.text = "Favourites"
    }

    private fun showResults(listOfQRResults: List<QrResult>) {
        if(listOfQRResults.isEmpty()){
            showEmptyState()
        } else {
            initRecycleView(listOfQRResults)
        }
    }

    private fun initRecycleView(listOfQRResults: List<QrResult>) {
        mView.scannedHistoryRecyclerView.layoutManager = LinearLayoutManager(context!!)
        mView.scannedHistoryRecyclerView.adapter =
            ScannedResultListAdapter(dbHelperI,context!!,listOfQRResults.toMutableList())
        showRecyclerView()
    }

    private fun showEmptyState() {
        mView.scannedHistoryRecyclerView.gone()
        mView.noResultFound.visible()
        mView.removeAll.gone()
    }

    private  fun showRecyclerView(){
        mView.scannedHistoryRecyclerView.visible()
        mView.noResultFound.gone()
        mView.removeAll.visible()
    }

}
