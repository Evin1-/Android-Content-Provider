package com.example.simplecontentprovider.database;

import android.provider.BaseColumns;

/**
 * Created by evin on 4/16/16.
 */
public class DatabaseContract {

    public static class UsersEntry implements BaseColumns {
        public static final String TABLE_NAME = "users";

        public static final String KEY_NAME = "name";
        public static final String KEY_AGE = "age";

        public static final String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME +
                "(" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_NAME + " TEXT," +
                KEY_AGE + " TEXT" +
                ")";
    }

    public static class CompaniesEntry implements BaseColumns {
        public static final String TABLE_NAME = "companies";

        public static final String KEY_NAME = "name";
        public static final String KEY_EMPLOYEES = "employees";
        public static final String KEY_NET_WORTH = "net_worth";

        public static final String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME +
                "(" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_NAME + " TEXT," +
                KEY_EMPLOYEES + " INTEGER," +
                KEY_NET_WORTH + " INTEGER" +
                ")";
    }
}
