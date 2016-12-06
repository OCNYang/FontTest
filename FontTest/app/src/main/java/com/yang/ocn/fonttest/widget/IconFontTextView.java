package com.yang.ocn.fonttest.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/*************************************************************
 * Created by OCN.Yang           * * * *   * * * *   *     * *
 * Time:2016/12/6 14:29         *     *   *         * *   * *
 * Email address:yangocn@163.com *     *   *         *   * * *
 * Web site:www.ocnyang.com      * * * *   * * * *   *     * *
 *************************************************************/

/**
 * 字体是自定义IconFont字体库的 TextView
 */

public class IconFontTextView extends TextView {

    public static final String ICON_FONT = "fonts/iconfont.ttf";

    public IconFontTextView(Context context) {
        this(context, null);
    }

    public IconFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(Typeface.createFromAsset(context.getAssets(), ICON_FONT));
    }
}
