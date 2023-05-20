package com.example.qr_v1.ui.scanned_history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\nH\u0002J\u0016\u0010!\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/qr_v1/ui/scanned_history/ScannedHistoryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dbHelperI", "Lcom/example/qr_v1/db/DBHelperI;", "mView", "Landroid/view/View;", "resultType", "Lcom/example/qr_v1/ui/scanned_history/ScannedHistoryFragment$ResultListType;", "clearRecords", "", "handleArguments", "init", "initRecycleView", "listOfQRResults", "", "Lcom/example/qr_v1/db/entities/QrResult;", "onClicks", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setSwipeRefreshLayout", "showAllResults", "showEmptyState", "showFavouriteResults", "showListOfResults", "showRecyclerView", "showRemoveAllScannedResultDialog", "showResults", "Companion", "ResultListType", "app_debug"})
public final class ScannedHistoryFragment extends androidx.fragment.app.Fragment {
    private com.example.qr_v1.ui.scanned_history.ScannedHistoryFragment.ResultListType resultType;
    private android.view.View mView;
    private com.example.qr_v1.db.DBHelperI dbHelperI;
    private static final java.lang.String ARGUMENT_RESULT_LIST_TYPE = "ArgumentResultListType";
    public static final com.example.qr_v1.ui.scanned_history.ScannedHistoryFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handleArguments() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void onClicks() {
    }
    
    private final void showRemoveAllScannedResultDialog() {
    }
    
    private final void clearRecords() {
    }
    
    private final void setSwipeRefreshLayout() {
    }
    
    private final void init() {
    }
    
    private final void showListOfResults() {
    }
    
    private final void showAllResults() {
    }
    
    private final void showFavouriteResults() {
    }
    
    private final void showResults(java.util.List<com.example.qr_v1.db.entities.QrResult> listOfQRResults) {
    }
    
    private final void initRecycleView(java.util.List<com.example.qr_v1.db.entities.QrResult> listOfQRResults) {
    }
    
    private final void showEmptyState() {
    }
    
    private final void showRecyclerView() {
    }
    
    public ScannedHistoryFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/qr_v1/ui/scanned_history/ScannedHistoryFragment$ResultListType;", "", "(Ljava/lang/String;I)V", "ALL_RESULT", "FAVOURITE_RESULT", "app_debug"})
    public static enum ResultListType {
        /*public static final*/ ALL_RESULT /* = new ALL_RESULT() */,
        /*public static final*/ FAVOURITE_RESULT /* = new FAVOURITE_RESULT() */;
        
        ResultListType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/qr_v1/ui/scanned_history/ScannedHistoryFragment$Companion;", "", "()V", "ARGUMENT_RESULT_LIST_TYPE", "", "newInstance", "Lcom/example/qr_v1/ui/scanned_history/ScannedHistoryFragment;", "screenType", "Lcom/example/qr_v1/ui/scanned_history/ScannedHistoryFragment$ResultListType;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.qr_v1.ui.scanned_history.ScannedHistoryFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.example.qr_v1.ui.scanned_history.ScannedHistoryFragment.ResultListType screenType) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}