package com.example.administrator.onetotow.main.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import greendao.greendao.DaoMaster;


public class SQLiteOpenHelper extends DaoMaster.OpenHelper {


    private static final String DB_NAME = "dd_hw_db";

    private static final SortedMap<Integer, Migration> ALL_MIGRATIONS = new TreeMap<>();

    static {
        ALL_MIGRATIONS.put(2, new ddhwV2Migration());  // 数字 > old版本  <= 当前安装版本 eg:  从2号版本直接升级到4号版本，会执行 3,4 的脚本
        ALL_MIGRATIONS.put(3, new ddhwV3Migration());
        ALL_MIGRATIONS.put(4, new ddhwV4Migration());
        ALL_MIGRATIONS.put(5, new ddhwV4Migration());
    }

    public SQLiteOpenHelper(Context context, SQLiteDatabase.CursorFactory factory) {
        super(context, DB_NAME, factory);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        super.onCreate(db);
        //executeMigrations(db, ALL_MIGRATIONS.keySet());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        Log.d("sqliteupdate", "Upgrade from" + oldVersion + "to" + newVersion);
        SortedMap<Integer, Migration> migrations = ALL_MIGRATIONS.subMap(oldVersion+1, newVersion+1);
        executeMigrations(sqLiteDatabase, migrations.keySet());

    }


    private void executeMigrations(final SQLiteDatabase paramSQLiteDatabase, final Set<Integer>
            migrationVersions) {
        for (final Integer version : migrationVersions) {
            ALL_MIGRATIONS.get(version).migrate(paramSQLiteDatabase);
        }
    }
}

interface Migration {

   void migrate(SQLiteDatabase db);

}


class ddhwV2Migration implements Migration {

    @Override
    public void migrate(SQLiteDatabase db) {
        db.execSQL("ALTER TABLE GROUP_MST ADD COLUMN test2");
    }

}


class ddhwV3Migration implements Migration {

    @Override
    public void migrate(SQLiteDatabase db) {
        db.execSQL("ALTER TABLE GROUP_MST ADD COLUMN test3");
    }

}


class ddhwV4Migration implements Migration {

    @Override
    public void migrate(SQLiteDatabase db) {
        db.execSQL("ALTER TABLE GROUP_MST ADD COLUMN test4");
    }

}

class ddhwV5Migration implements Migration {

    @Override
    public void migrate(SQLiteDatabase db) {
        db.execSQL("ALTER TABLE GROUP_MST ADD COLUMN test5");
    }

}

