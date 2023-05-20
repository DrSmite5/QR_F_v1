package com.example.qr_v1.ui.diaogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/qr_v1/ui/diaogs/QrCodeResultDialog;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "dbHelperI", "Lcom/example/qr_v1/db/DBHelperI;", "dialog", "Landroid/app/Dialog;", "onDismissListener", "Lcom/example/qr_v1/ui/diaogs/QrCodeResultDialog$OnDismissListener;", "qrResult", "Lcom/example/qr_v1/db/entities/QrResult;", "addToFavourites", "", "copyResultToClipBoard", "init", "initDialog", "onClicks", "removeFromFavourite", "setOnDismissListener", "shareResult", "show", "OnDismissListener", "app_debug"})
public final class QrCodeResultDialog {
    private android.app.Dialog dialog;
    private com.example.qr_v1.db.entities.QrResult qrResult;
    private com.example.qr_v1.db.DBHelperI dbHelperI;
    private com.example.qr_v1.ui.diaogs.QrCodeResultDialog.OnDismissListener onDismissListener;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    private final void init() {
    }
    
    private final void initDialog() {
    }
    
    public final void setOnDismissListener(@org.jetbrains.annotations.NotNull()
    com.example.qr_v1.ui.diaogs.QrCodeResultDialog.OnDismissListener onDismissListener) {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    com.example.qr_v1.db.entities.QrResult qrResult) {
    }
    
    private final void onClicks() {
    }
    
    private final void addToFavourites() {
    }
    
    private final void removeFromFavourite() {
    }
    
    private final void shareResult() {
    }
    
    private final void copyResultToClipBoard() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public QrCodeResultDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/qr_v1/ui/diaogs/QrCodeResultDialog$OnDismissListener;", "", "onDismiss", "", "app_debug"})
    public static abstract interface OnDismissListener {
        
        public abstract void onDismiss();
    }
}