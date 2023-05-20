package com.example.qr_v1.db

import com.example.qr_v1.db.database.QrResultDatabase
import com.example.qr_v1.db.entities.QrResult
import java.util.*

class DBHelper(var qrResultDatabase: QrResultDatabase) : DBHelperI{

    override fun insertQrResult(result: String): Int {
        val time = Calendar.getInstance()
        val resultType = "TEXT"
        val qrResult = QrResult(result = result, resultTYpe = resultType, calendar = time,favourite = false)
        return qrResultDatabase.getQRDao().insertQrResult(qrResult).toInt()
    }

    override fun getQrResult(id: Int): QrResult {
        return qrResultDatabase.getQRDao().getQrResult(id)
    }

    override fun addToFavourite(id: Int): Int {
        return qrResultDatabase.getQRDao().addToFavourite(id)
    }

    override fun removeFromFavourite(id: Int): Int {
        return qrResultDatabase.getQRDao().removeFromFavourite(id)
    }

    override fun getAllQrScannedResult(): List<QrResult> {
        return qrResultDatabase.getQRDao().getAllScannedResults()
    }

    override fun getAllFavouriteQrScannedResult(): List<QrResult> {
        return qrResultDatabase.getQRDao().getAllFavouritResults()
    }

    override fun deleteQrResult(id: Int): Int {
        return qrResultDatabase.getQRDao().deleteQrResult(id)
    }

    override fun deleteAllQrScannedResults() {
        qrResultDatabase.getQRDao().deleteAllScannedResults()
    }

    override fun deleteAllFavouriteQrScannedResults() {
        qrResultDatabase.getQRDao().deleteAllFavouriteResult()
    }
}