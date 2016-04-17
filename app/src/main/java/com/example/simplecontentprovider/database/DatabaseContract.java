package com.example.simplecontentprovider.database;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

import com.example.simplecontentprovider.provider.SimpleProvider;

/**
 * Created by evin on 4/16/16.
 */
public class DatabaseContract {

    public static final String PATH_USERS = "users";
    public static final String PATH_COMPANIES = "companies";

    public static class UsersEntry implements BaseColumns {

        public static final Uri CONTENT_URI = SimpleProvider.BASE_URI
                .buildUpon()
                .appendPath(PATH_USERS)
                .build();

        public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE +
                "/" + SimpleProvider.AUTHORITY +
                "/" + PATH_USERS;
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE +
                "/" + SimpleProvider.AUTHORITY +
                "/" + PATH_USERS;

        public static final String TABLE_NAME = "users";

        public static final String KEY_NAME = "name";
        public static final String KEY_AGE = "age";

        public static final String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME +
                "(" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_NAME + " TEXT," +
                KEY_AGE + " INTEGER" +
                ")";
    }

    public static class CompaniesEntry implements BaseColumns {

        public static final Uri CONTENT_URI = SimpleProvider.BASE_URI
                .buildUpon()
                .appendPath(PATH_COMPANIES)
                .build();

        public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE +
                "/" + SimpleProvider.AUTHORITY +
                "/" + PATH_COMPANIES;
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE +
                "/" + SimpleProvider.AUTHORITY +
                "/" + PATH_COMPANIES;

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
