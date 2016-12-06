package com.yang.ocn.fonttest;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CommonMethodsActivity extends AppCompatActivity {

    public static final String AWESOME_FONT = "fonts/fontawesome-webfont.ttf";
    public static final String ICON_FONT = "fonts/iconfont.ttf";
    private Typeface mAwesomeFont;
    private Typeface mIconFont;

    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_methods);

        mAwesomeFont = Typeface.createFromAsset(this.getAssets(),AWESOME_FONT);
        mIconFont = Typeface.createFromAsset(getAssets(),ICON_FONT);

        this.text6 = (TextView) findViewById(R.id.text6);
        this.text5 = (TextView) findViewById(R.id.text5);
        this.text4 = (TextView) findViewById(R.id.text4);
        this.text3 = (TextView) findViewById(R.id.text3);
        this.text2 = (TextView) findViewById(R.id.text2);
        this.text1 = (TextView) findViewById(R.id.text1);

        text1.setTypeface(mIconFont);
        text2.setTypeface(mIconFont);
        text3.setTypeface(mIconFont);

        text4.setTypeface(mAwesomeFont);
        text5.setTypeface(mAwesomeFont);
        text6.setTypeface(mAwesomeFont);

    }
}
