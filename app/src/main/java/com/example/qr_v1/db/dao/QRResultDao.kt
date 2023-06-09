package com.example.qr_v1.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.qr_v1.db.entities.QrResult

@Dao
interface QRResultDao {

    @Query("SELECT * FROM QrResult ORDER BY time DESC")
    fun getAllScannedResults() : List<QrResult>

    @Query("SELECT * FROM QrResult WHERE favourite = 1")
    fun getAllFavouritResults() : List<QrResult>

    @Query("DELETE FROM QrResult")
    fun deleteAllScannedResults()

    @Query("DELETE FROM QrResult WHERE favourite = 1")
    fun deleteAllFavouriteResult()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertQrResult(qrResult: QrResult) : Long

    @Query("DELETE FROM QrResult WHERE id = :id")
    fun deleteQrResult(id: Int) : Int

    @Query("SELECT * FROM QrResult where id = :id")
    fun getQrResult(id : Int) : QrResult

    @Query("UPDATE QrResult SET favourite = 1 WHERE id = :id")
    fun addToFavourite(id : Int) : Int

    @Query("UPDATE QrResult SET favourite = 0 WHERE id = :id")
    fun removeFromFavourite(id : Int) : Int

}