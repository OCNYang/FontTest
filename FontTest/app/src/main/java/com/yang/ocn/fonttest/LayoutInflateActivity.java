package com.yang.ocn.fonttest;

import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yang.ocn.fonttest.utils.IconFontLayoutFactory;

public class LayoutInflateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        LayoutInflaterCompat.setFactory(getLayoutInflater(),
                new IconFontLayoutFactory(this,getDelegate()));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflate);
    }
}
