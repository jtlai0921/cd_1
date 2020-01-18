package com.demo.helloandroid_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private static final boolean DEBUG = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "My Error message put here…");
        Log.w(TAG, "My Warning message put here…");
        Log.i(TAG, "My Information message put here…");

        if(DEBUG) {
            Log.d(TAG, "My Debug message put here…");
            Log.v(TAG, "My Verbose message put here…");
        }
    }
}
