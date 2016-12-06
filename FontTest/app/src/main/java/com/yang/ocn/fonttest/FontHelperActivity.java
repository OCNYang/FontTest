package com.yang.ocn.fonttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yang.ocn.fonttest.utils.FontHelper;

public class FontHelperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font_helper);

        FontHelper.injectFont(findViewById(android.R.id.content));

    }
}
