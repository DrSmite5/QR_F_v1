package com.example.qr_v1.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\u0006H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\'J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/example/qr_v1/db/dao/QRResultDao;", "", "addToFavourite", "", "id", "deleteAllFavouriteResult", "", "deleteAllScannedResults", "deleteQrResult", "getAllFavouritResults", "", "Lcom/example/qr_v1/db/entities/QrResult;", "getAllScannedResults", "getQrResult", "insertQrResult", "", "qrResult", "removeFromFavourite", "app_debug"})
public abstract interface QRResultDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM QrResult ORDER BY time DESC")
    public abstract java.util.List<com.example.qr_v1.db.entities.QrResult> getAllScannedResults();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM QrResult WHERE favourite = 1")
    public abstract java.util.List<com.example.qr_v1.db.entities.QrResult> getAllFavouritResults();
    
    @androidx.room.Query(value = "DELETE FROM QrResult")
    public abstract void deleteAllScannedResults();
    
    @androidx.room.Query(value = "DELETE FROM QrResult WHERE favourite = 1")
    public abstract void deleteAllFavouriteResult();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertQrResult(@org.jetbrains.annotations.NotNull()
    com.example.qr_v1.db.entities.QrResult qrResult);
    
    @androidx.room.Query(value = "DELETE FROM QrResult WHERE id = :id")
    public abstract int deleteQrResult(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM QrResult where id = :id")
    public abstract com.example.qr_v1.db.entities.QrResult getQrResult(int id);
    
    @androidx.room.Query(value = "UPDATE QrResult SET favourite = 1 WHERE id = :id")
    public abstract int addToFavourite(int id);
    
    @androidx.room.Query(value = "UPDATE QrResult SET favourite = 0 WHERE id = :id")
    public abstract int removeFromFavourite(int id);
}