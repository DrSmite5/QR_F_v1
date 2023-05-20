package com.example.qr_v1.db

import com.example.qr_v1.db.entities.QrResult

interface DBHelperI {

    fun insertQrResult(result: String) : Int

    fun getQrResult(id : Int) : QrResult

    fun addToFavourite(id : Int) : Int

    fun removeFromFavourite(id : Int) : Int

    fun getAllQrScannedResult() : List<QrResult>
    fun getAllFavouriteQrScannedResult() : List<QrResult>

    fun deleteQrResult(id : Int) : Int

    fun deleteAllQrScannedResults()

    fun deleteAllFavouriteQrScannedResults()

}