package com.example.qr_v1.db.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.qr_v1.db.converters.DateTimeConverters;
import com.example.qr_v1.db.entities.QrResult;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QRResultDao_Impl implements QRResultDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfQrResult;

  private final DateTimeConverters __dateTimeConverters = new DateTimeConverters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllScannedResults;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFavouriteResult;

  private final SharedSQLiteStatement __preparedStmtOfDeleteQrResult;

  private final SharedSQLiteStatement __preparedStmtOfAddToFavourite;

  private final SharedSQLiteStatement __preparedStmtOfRemoveFromFavourite;

  public QRResultDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQrResult = new EntityInsertionAdapter<QrResult>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `QrResult`(`id`,`result`,`result_type`,`favourite`,`time`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, QrResult value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getResult() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getResult());
        }
        if (value.getResultTYpe() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResultTYpe());
        }
        final int _tmp;
        _tmp = value.getFavourite() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        final Long _tmp_1;
        _tmp_1 = __dateTimeConverters.fromCalendar(value.getCalendar());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp_1);
        }
      }
    };
    this.__preparedStmtOfDeleteAllScannedResults = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM QrResult";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllFavouriteResult = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM QrResult WHERE favourite = 1";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteQrResult = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM QrResult WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfAddToFavourite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE QrResult SET favourite = 1 WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfRemoveFromFavourite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE QrResult SET favourite = 0 WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insertQrResult(final QrResult qrResult) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfQrResult.insertAndReturnId(qrResult);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllScannedResults() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllScannedResults.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllScannedResults.release(_stmt);
    }
  }

  @Override
  public void deleteAllFavouriteResult() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFavouriteResult.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllFavouriteResult.release(_stmt);
    }
  }

  @Override
  public int deleteQrResult(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteQrResult.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteQrResult.release(_stmt);
    }
  }

  @Override
  public int addToFavourite(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfAddToFavourite.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfAddToFavourite.release(_stmt);
    }
  }

  @Override
  public int removeFromFavourite(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveFromFavourite.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemoveFromFavourite.release(_stmt);
    }
  }

  @Override
  public List<QrResult> getAllScannedResults() {
    final String _sql = "SELECT * FROM QrResult ORDER BY time DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
      final int _cursorIndexOfResultTYpe = CursorUtil.getColumnIndexOrThrow(_cursor, "result_type");
      final int _cursorIndexOfFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "favourite");
      final int _cursorIndexOfCalendar = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final List<QrResult> _result = new ArrayList<QrResult>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final QrResult _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpResult;
        _tmpResult = _cursor.getString(_cursorIndexOfResult);
        final String _tmpResultTYpe;
        _tmpResultTYpe = _cursor.getString(_cursorIndexOfResultTYpe);
        final boolean _tmpFavourite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFavourite);
        _tmpFavourite = _tmp != 0;
        final Calendar _tmpCalendar;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfCalendar)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfCalendar);
        }
        _tmpCalendar = __dateTimeConverters.toCalendar(_tmp_1);
        _item = new QrResult(_tmpId,_tmpResult,_tmpResultTYpe,_tmpFavourite,_tmpCalendar);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<QrResult> getAllFavouritResults() {
    final String _sql = "SELECT * FROM QrResult WHERE favourite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
      final int _cursorIndexOfResultTYpe = CursorUtil.getColumnIndexOrThrow(_cursor, "result_type");
      final int _cursorIndexOfFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "favourite");
      final int _cursorIndexOfCalendar = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final List<QrResult> _result = new ArrayList<QrResult>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final QrResult _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpResult;
        _tmpResult = _cursor.getString(_cursorIndexOfResult);
        final String _tmpResultTYpe;
        _tmpResultTYpe = _cursor.getString(_cursorIndexOfResultTYpe);
        final boolean _tmpFavourite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFavourite);
        _tmpFavourite = _tmp != 0;
        final Calendar _tmpCalendar;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfCalendar)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfCalendar);
        }
        _tmpCalendar = __dateTimeConverters.toCalendar(_tmp_1);
        _item = new QrResult(_tmpId,_tmpResult,_tmpResultTYpe,_tmpFavourite,_tmpCalendar);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public QrResult getQrResult(final int id) {
    final String _sql = "SELECT * FROM QrResult where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
      final int _cursorIndexOfResultTYpe = CursorUtil.getColumnIndexOrThrow(_cursor, "result_type");
      final int _cursorIndexOfFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "favourite");
      final int _cursorIndexOfCalendar = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final QrResult _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpResult;
        _tmpResult = _cursor.getString(_cursorIndexOfResult);
        final String _tmpResultTYpe;
        _tmpResultTYpe = _cursor.getString(_cursorIndexOfResultTYpe);
        final boolean _tmpFavourite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFavourite);
        _tmpFavourite = _tmp != 0;
        final Calendar _tmpCalendar;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfCalendar)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfCalendar);
        }
        _tmpCalendar = __dateTimeConverters.toCalendar(_tmp_1);
        _result = new QrResult(_tmpId,_tmpResult,_tmpResultTYpe,_tmpFavourite,_tmpCalendar);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
