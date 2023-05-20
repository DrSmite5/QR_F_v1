package com.example.qr_v1.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0012"}, d2 = {"Lcom/example/qr_v1/db/DBHelperI;", "", "addToFavourite", "", "id", "deleteAllFavouriteQrScannedResults", "", "deleteAllQrScannedResults", "deleteQrResult", "getAllFavouriteQrScannedResult", "", "Lcom/example/qr_v1/db/entities/QrResult;", "getAllQrScannedResult", "getQrResult", "insertQrResult", "result", "", "removeFromFavourite", "app_debug"})
public abstract interface DBHelperI {
    
    public abstract int insertQrResult(@org.jetbrains.annotations.NotNull()
    java.lang.String result);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.qr_v1.db.entities.QrResult getQrResult(int id);
    
    public abstract int addToFavourite(int id);
    
    public abstract int removeFromFavourite(int id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.qr_v1.db.entities.QrResult> getAllQrScannedResult();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.qr_v1.db.entities.QrResult> getAllFavouriteQrScannedResult();
    
    public abstract int deleteQrResult(int id);
    
    public abstract void deleteAllQrScannedResults();
    
    public abstract void deleteAllFavouriteQrScannedResults();
}