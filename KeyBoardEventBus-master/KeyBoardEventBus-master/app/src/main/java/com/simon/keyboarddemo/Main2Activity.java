package com.simon.keyboarddemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        InputMethodManager inputMethodManager = (InputMethodManager)Main2Activity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
        
        SoftKeyboardStateHelper ss=new SoftKeyboardStateHelper(findViewById(R.id.ddd));
        ss.addSoftKeyboardStateListener(new SoftKeyboardStateHelper.SoftKeyboardStateListener() {
            @Override
            public void onSoftKeyboardOpened(int keyboardHeightInPx) {
                Log.e("=============","弹开了");
            }

            @Override
            public void onSoftKeyboardClosed() {
                Log.e("=============","关了");

            }
        });

    }
}
