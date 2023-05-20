package com.example.qr_v1.ui.adapters

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.qr_v1.R
import com.example.qr_v1.db.DBHelperI
import com.example.qr_v1.db.entities.QrResult
import com.example.qr_v1.ui.diaogs.QrCodeResultDialog
import com.example.qr_v1.ui.utils.gone
import com.example.qr_v1.ui.utils.toFormattedDisplay
import com.example.qr_v1.ui.utils.visible
import kotlinx.android.synthetic.main.layout_single_item_qr_result.view.*

class ScannedResultListAdapter(
    var dbHelperI: DBHelperI,
    var context : Context,
    var ListOfScannedResults : MutableList<QrResult>
    ) : RecyclerView.Adapter<ScannedResultListAdapter.ScannedResultListViewHolder>(){

    private var resultDialog = QrCodeResultDialog(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScannedResultListViewHolder {
        return ScannedResultListViewHolder(
            LayoutInflater.from(context).inflate(R.layout.layout_single_item_qr_result,parent,false))
    }

    override fun getItemCount(): Int {
        return ListOfScannedResults.size
    }

    override fun onBindViewHolder(holder: ScannedResultListViewHolder, position: Int) {
        holder.bind(ListOfScannedResults[position], position)
    }

    inner class ScannedResultListViewHolder(var view : View) : RecyclerView.ViewHolder(view){

        fun bind(qrResult: QrResult, position: Int){
            view.result.text = qrResult.result
            view.tvTime.text = qrResult.calendar.toFormattedDisplay()
            setFavourite(qrResult.favourite)
            onClicks(qrResult, position)
        }

        private fun onClicks(qrResult: QrResult, position: Int) {
            view.setOnClickListener {
                resultDialog.show(qrResult)
            }

            view.setOnLongClickListener{
                showDeleteDialog(qrResult, position)
                return@setOnLongClickListener true
            }
        }

        private fun showDeleteDialog(qrResult: QrResult, position: Int) {
            AlertDialog.Builder(context,R.style.CustomAlertDialog)
                .setTitle("Delete")
                .setMessage("Delete this QR?")
                .setPositiveButton("Delete"){ dialog, which ->
                    deleteThisRecord(qrResult, position)
                }
                .setNegativeButton("Cancel"){dialog, which ->
                    dialog.cancel()
                }.show()
        }

        private fun deleteThisRecord(qrResult: QrResult, position: Int) {
            dbHelperI.deleteQrResult(qrResult.id!!)
            ListOfScannedResults.removeAt(position)
            notifyItemRemoved(position)
        }

        private fun setFavourite(favourite: Boolean) {
            if(favourite){
                view.favouriteIcon.visible()
            } else {
                view.favouriteIcon.gone()
            }
        }
    }
}