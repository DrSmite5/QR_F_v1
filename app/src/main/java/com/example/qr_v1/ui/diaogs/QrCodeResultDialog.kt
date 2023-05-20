package com.example.qr_v1.ui.diaogs

import android.app.Dialog
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.example.qr_v1.R
import com.example.qr_v1.db.DBHelper
import com.example.qr_v1.db.DBHelperI
import com.example.qr_v1.db.database.QrResultDatabase
import com.example.qr_v1.db.entities.QrResult
import com.example.qr_v1.ui.utils.toFormattedDisplay
import kotlinx.android.synthetic.main.layout_qr_result_show.*

class QrCodeResultDialog(var context : Context) {

    private lateinit var  dialog : Dialog

    private var qrResult : QrResult? = null

    private lateinit var dbHelperI :DBHelperI

    private var onDismissListener : OnDismissListener? = null

    init {
        init()
        initDialog()
    }

    private fun init() {
        dbHelperI = DBHelper(QrResultDatabase.getAppDatabase(context!!)!!)
    }

    private fun initDialog() {
        dialog = Dialog(context)
        dialog.setContentView(R.layout.layout_qr_result_show)
        dialog.setCancelable(false)
        onClicks()
    }

    fun setOnDismissListener(onDismissListener: OnDismissListener){
        this.onDismissListener = onDismissListener
    }

    fun show(qrResult: QrResult){
        this.qrResult = qrResult
        dialog.scannedDate.text = qrResult?.calendar?.toFormattedDisplay()
        dialog.scannedText.text = qrResult.result
        dialog.favouriteIcon.isSelected = qrResult.favourite
        dialog.show()
    }

    private fun onClicks() {
        dialog.favouriteIcon.setOnClickListener {
            if(dialog.favouriteIcon.isSelected){
                removeFromFavourite()
            } else {
                addToFavourites()
            }
        }
        dialog.shareResult.setOnClickListener {
            shareResult()
        }
        dialog.copyResult.setOnClickListener {
            copyResultToClipBoard()
        }
        dialog.cancelDialog.setOnClickListener {
            onDismissListener?.onDismiss()
            dialog.dismiss()
        }
    }

    private fun addToFavourites() {
        dialog.favouriteIcon.isSelected = true
        dbHelperI.addToFavourite(qrResult?.id!!)
    }

    private fun removeFromFavourite() {
        dialog.favouriteIcon.isSelected = false
        dbHelperI.removeFromFavourite(qrResult?.id!!)
    }

    private fun shareResult() {
        val txtIntent = Intent(Intent.ACTION_SEND)
        txtIntent.type = "text/plain"
        txtIntent.putExtra(Intent.EXTRA_TEXT,dialog.scannedText.text.toString())
        context.startActivity(txtIntent)
    }

    private fun copyResultToClipBoard() {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("qrScannerResult",dialog.scannedText.text)
        clipboard.text = clip.getItemAt(0).text.toString()
        Toast.makeText(context, "Copied!", Toast.LENGTH_SHORT).show()
    }

    interface OnDismissListener{
        fun onDismiss()
    }
}