package com.example.simplecontentprovider;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.simplecontentprovider.database.DatabaseContract;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    private static final String SAMPLE_NAME = "Edwin";
    private static final int SAMPLE_AGE = 63;

    int mCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void insertRows(View view) {
        Uri usersUri = DatabaseContract.UsersEntry.CONTENT_URI;

        ContentValues contentValues = new ContentValues();

        contentValues.put(DatabaseContract.UsersEntry.KEY_NAME, SAMPLE_NAME);
        contentValues.put(DatabaseContract.UsersEntry.KEY_AGE, SAMPLE_AGE + mCounter++);

        Uri resultUri = getContentResolver().insert(usersUri, contentValues);

        Log.d(TAG, "insertRows: " + resultUri);
    }

    public void logRows(View view) {
        Uri usersUri = DatabaseContract.UsersEntry.CONTENT_URI;

        Cursor resultCursor = getContentResolver().query(usersUri,
                null,
                null,
                null,
                null);

        resultCursor.moveToFirst();

        do {
            Log.d(TAG, "logRows: " + resultCursor.getString(resultCursor.getColumnIndex(DatabaseContract.UsersEntry.KEY_NAME)));
            Log.d(TAG, "logRows: " + resultCursor.getInt(resultCursor.getColumnIndex(DatabaseContract.UsersEntry.KEY_AGE)));
        } while (resultCursor.moveToNext());

        resultCursor.close();
    }
}
