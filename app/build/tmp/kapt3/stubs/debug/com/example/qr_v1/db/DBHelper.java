package com.example.qr_v1.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0018"}, d2 = {"Lcom/example/qr_v1/db/DBHelper;", "Lcom/example/qr_v1/db/DBHelperI;", "qrResultDatabase", "Lcom/example/qr_v1/db/database/QrResultDatabase;", "(Lcom/example/qr_v1/db/database/QrResultDatabase;)V", "getQrResultDatabase", "()Lcom/example/qr_v1/db/database/QrResultDatabase;", "setQrResultDatabase", "addToFavourite", "", "id", "deleteAllFavouriteQrScannedResults", "", "deleteAllQrScannedResults", "deleteQrResult", "getAllFavouriteQrScannedResult", "", "Lcom/example/qr_v1/db/entities/QrResult;", "getAllQrScannedResult", "getQrResult", "insertQrResult", "result", "", "removeFromFavourite", "app_debug"})
public final class DBHelper implements com.example.qr_v1.db.DBHelperI {
    @org.jetbrains.annotations.NotNull()
    private com.example.qr_v1.db.database.QrResultDatabase qrResultDatabase;
    
    @java.lang.Override()
    public int insertQrResult(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.qr_v1.db.entities.QrResult getQrResult(int id) {
        return null;
    }
    
    @java.lang.Override()
    public int addToFavourite(int id) {
        return 0;
    }
    
    @java.lang.Override()
    public int removeFromFavourite(int id) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.qr_v1.db.entities.QrResult> getAllQrScannedResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.qr_v1.db.entities.QrResult> getAllFavouriteQrScannedResult() {
        return null;
    }
    
    @java.lang.Override()
    public int deleteQrResult(int id) {
        return 0;
    }
    
    @java.lang.Override()
    public void deleteAllQrScannedResults() {
    }
    
    @java.lang.Override()
    public void deleteAllFavouriteQrScannedResults() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.qr_v1.db.database.QrResultDatabase getQrResultDatabase() {
        return null;
    }
    
    public final void setQrResultDatabase(@org.jetbrains.annotations.NotNull()
    com.example.qr_v1.db.database.QrResultDatabase p0) {
    }
    
    public DBHelper(@org.jetbrains.annotations.NotNull()
    com.example.qr_v1.db.database.QrResultDatabase qrResultDatabase) {
        super();
    }
}