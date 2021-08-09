package com.example.timetracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ListApps.db";
    public static final String TABLE_NAME = "List_apps";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "APP";
    public static final String COL_3 = "PACKAGE";

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, APP TEXT, PACKAGE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(db);
    }
  /**  public  boolean insertData (String appname, String packagename) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, appname );
        contentValues.put(COL_3, packagename );
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1 )
            return false;
        else
            return true;
    }**/
}
