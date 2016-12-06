package com.yang.ocn.fonttest.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/*************************************************************
 * Created by OCN.Yang           * * * *   * * * *   *     * *
 * Time:2016/12/6 14:38         *     *   *         * *   * *
 * Email address:yangocn@163.com *     *   *         *   * * *
 * Web site:www.ocnyang.com      * * * *   * * * *   *     * *
 *************************************************************/

/**
 * 字体是AwesomeFont的 TextView
 */

public class AwesomeFontTextView extends TextView {

    public static final String AWESOME_FONT = "fonts/fontawesome-webfont.ttf";

    public AwesomeFontTextView(Context context) {
        this(context,null);
    }

    public AwesomeFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(Typeface.createFromAsset(context.getAssets(), AWESOME_FONT));
    }
}
