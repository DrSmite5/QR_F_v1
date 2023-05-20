package com.example.qr_v1.db.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.qr_v1.db.dao.QRResultDao;
import com.example.qr_v1.db.dao.QRResultDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QrResultDatabase_Impl extends QrResultDatabase {
  private volatile QRResultDao _qRResultDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `QrResult` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `result` TEXT, `result_type` TEXT, `favourite` INTEGER NOT NULL, `time` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c4a294848021518037898722e2edc52e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `QrResult`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsQrResult = new HashMap<String, TableInfo.Column>(5);
        _columnsQrResult.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsQrResult.put("result", new TableInfo.Column("result", "TEXT", false, 0));
        _columnsQrResult.put("result_type", new TableInfo.Column("result_type", "TEXT", false, 0));
        _columnsQrResult.put("favourite", new TableInfo.Column("favourite", "INTEGER", true, 0));
        _columnsQrResult.put("time", new TableInfo.Column("time", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysQrResult = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesQrResult = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoQrResult = new TableInfo("QrResult", _columnsQrResult, _foreignKeysQrResult, _indicesQrResult);
        final TableInfo _existingQrResult = TableInfo.read(_db, "QrResult");
        if (! _infoQrResult.equals(_existingQrResult)) {
          throw new IllegalStateException("Migration didn't properly handle QrResult(com.example.qr_v1.db.entities.QrResult).\n"
                  + " Expected:\n" + _infoQrResult + "\n"
                  + " Found:\n" + _existingQrResult);
        }
      }
    }, "c4a294848021518037898722e2edc52e", "a66d909505493a5f89beebe9b8151426");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "QrResult");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `QrResult`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public QRResultDao getQRDao() {
    if (_qRResultDao != null) {
      return _qRResultDao;
    } else {
      synchronized(this) {
        if(_qRResultDao == null) {
          _qRResultDao = new QRResultDao_Impl(this);
        }
        return _qRResultDao;
      }
    }
  }
}
