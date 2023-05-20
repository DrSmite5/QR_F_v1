package com.example.qr_v1.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001#B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/qr_v1/ui/adapters/ScannedResultListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/qr_v1/ui/adapters/ScannedResultListAdapter$ScannedResultListViewHolder;", "dbHelperI", "Lcom/example/qr_v1/db/DBHelperI;", "context", "Landroid/content/Context;", "ListOfScannedResults", "", "Lcom/example/qr_v1/db/entities/QrResult;", "(Lcom/example/qr_v1/db/DBHelperI;Landroid/content/Context;Ljava/util/List;)V", "getListOfScannedResults", "()Ljava/util/List;", "setListOfScannedResults", "(Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDbHelperI", "()Lcom/example/qr_v1/db/DBHelperI;", "setDbHelperI", "(Lcom/example/qr_v1/db/DBHelperI;)V", "resultDialog", "Lcom/example/qr_v1/ui/diaogs/QrCodeResultDialog;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ScannedResultListViewHolder", "app_debug"})
public final class ScannedResultListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.qr_v1.ui.adapters.ScannedResultListAdapter.ScannedResultListViewHolder> {
    private com.example.qr_v1.ui.diaogs.QrCodeResultDialog resultDialog;
    @org.jetbrains.annotations.NotNull()
    private com.example.qr_v1.db.DBHelperI dbHelperI;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.qr_v1.db.entities.QrResult> ListOfScannedResults;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.qr_v1.ui.adapters.ScannedResultListAdapter.ScannedResultListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.qr_v1.ui.adapters.ScannedResultListAdapter.ScannedResultListViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.qr_v1.db.DBHelperI getDbHelperI() {
        return null;
    }
    
    public final void setDbHelperI(@org.jetbrains.annotations.NotNull()
    com.example.qr_v1.db.DBHelperI p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.qr_v1.db.entities.QrResult> getListOfScannedResults() {
        return null;
    }
    
    public final void setListOfScannedResults(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.qr_v1.db.entities.QrResult> p0) {
    }
    
    public ScannedResultListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.qr_v1.db.DBHelperI dbHelperI, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.qr_v1.db.entities.QrResult> ListOfScannedResults) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/qr_v1/ui/adapters/ScannedResultListAdapter$ScannedResultListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/qr_v1/ui/adapters/ScannedResultListAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "bind", "", "qrResult", "Lcom/example/qr_v1/db/entities/QrResult;", "position", "", "deleteThisRecord", "onClicks", "setFavourite", "favourite", "", "showDeleteDialog", "app_debug"})
    public final class ScannedResultListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.view.View view;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.qr_v1.db.entities.QrResult qrResult, int position) {
        }
        
        private final void onClicks(com.example.qr_v1.db.entities.QrResult qrResult, int position) {
        }
        
        private final void showDeleteDialog(com.example.qr_v1.db.entities.QrResult qrResult, int position) {
        }
        
        private final void deleteThisRecord(com.example.qr_v1.db.entities.QrResult qrResult, int position) {
        }
        
        private final void setFavourite(boolean favourite) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public ScannedResultListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}