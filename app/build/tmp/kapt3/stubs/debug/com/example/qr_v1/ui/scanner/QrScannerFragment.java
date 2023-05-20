package com.example.qr_v1.ui.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0002J\b\u0010\u001e\u001a\u00020\rH\u0016J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\b\u0010\"\u001a\u00020\rH\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020\rH\u0002J\b\u0010&\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/qr_v1/ui/scanner/QrScannerFragment;", "Landroidx/fragment/app/Fragment;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "()V", "dbHelperI", "Lcom/example/qr_v1/db/DBHelperI;", "mView", "Landroid/view/View;", "resultDialog", "Lcom/example/qr_v1/ui/diaogs/QrCodeResultDialog;", "scannerView", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "handleResult", "", "rawResult", "Lcom/google/zxing/Result;", "init", "initViews", "initializeQrScanner", "offFlashLight", "onClicks", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFlashLight", "onPause", "onQrResult", "text", "", "onResume", "saveToDatabase", "result", "setResultDialog", "startQrCamera", "Companion", "app_debug"})
public final class QrScannerFragment extends androidx.fragment.app.Fragment implements me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler {
    private android.view.View mView;
    private me.dm7.barcodescanner.zxing.ZXingScannerView scannerView;
    private com.example.qr_v1.ui.diaogs.QrCodeResultDialog resultDialog;
    private com.example.qr_v1.db.DBHelperI dbHelperI;
    public static final com.example.qr_v1.ui.scanner.QrScannerFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void init() {
    }
    
    private final void initViews() {
    }
    
    private final void setResultDialog() {
    }
    
    private final void onClicks() {
    }
    
    private final void offFlashLight() {
    }
    
    private final void onFlashLight() {
    }
    
    private final void initializeQrScanner() {
    }
    
    private final void startQrCamera() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.Nullable()
    com.google.zxing.Result rawResult) {
    }
    
    private final void onQrResult(java.lang.String text) {
    }
    
    private final void saveToDatabase(java.lang.String result) {
    }
    
    public QrScannerFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/qr_v1/ui/scanner/QrScannerFragment$Companion;", "", "()V", "newInstance", "Lcom/example/qr_v1/ui/scanner/QrScannerFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.qr_v1.ui.scanner.QrScannerFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}