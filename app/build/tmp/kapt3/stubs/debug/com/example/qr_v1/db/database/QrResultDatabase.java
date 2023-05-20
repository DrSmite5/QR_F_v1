package com.example.qr_v1.db.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.qr_v1.db.entities.QrResult.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/qr_v1/db/database/QrResultDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getQRDao", "Lcom/example/qr_v1/db/dao/QRResultDao;", "Companion", "app_debug"})
public abstract class QrResultDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String DB_NAME = "QrResultDatabase";
    private static com.example.qr_v1.db.database.QrResultDatabase qrResultDatabase;
    public static final com.example.qr_v1.db.database.QrResultDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.qr_v1.db.dao.QRResultDao getQRDao();
    
    public QrResultDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/qr_v1/db/database/QrResultDatabase$Companion;", "", "()V", "DB_NAME", "", "qrResultDatabase", "Lcom/example/qr_v1/db/database/QrResultDatabase;", "getAppDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.qr_v1.db.database.QrResultDatabase getAppDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}