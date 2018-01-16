package com.bonaro.mediterraneo;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by lozano on 21/01/17.
 */
public class MyDatabase extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "db_mediterraneo.sqlite";
    private static final int DATABASE_VERSION = 3;

    public MyDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        setForcedUpgrade();
    }
}