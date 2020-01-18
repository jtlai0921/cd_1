package com.demo.helloandroid_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Intent intent = getPackageManager()
                    .getLaunchIntentForPackage("com.waterdaaan.cpufloat");
            startActivity( intent );
        } catch (NullPointerException e) {
            Log.e(TAG,"NullPointerException");
        }
    }
}
