package com.yang.ocn.fonttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.common_methods_tv).setOnClickListener(this);
        findViewById(R.id.fonthelper_method_tv).setOnClickListener(this);
        findViewById(R.id.layoutinflate_method_tv).setOnClickListener(this);
        findViewById(R.id.customview_method_tv).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.common_methods_tv:
                intent.setClass(this, CommonMethodsActivity.class);
                break;
            case R.id.fonthelper_method_tv:
                intent.setClass(this, FontHelperActivity.class);
                break;
            case R.id.layoutinflate_method_tv:
                intent.setClass(this, LayoutInflateActivity.class);
                break;
            case R.id.customview_method_tv:
                intent.setClass(this, CustomViewActivity.class);
                break;
            default:
                break;
        }
        startActivity(intent);
    }

}
