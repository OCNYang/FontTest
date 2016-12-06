package com.yang.ocn.fonttest.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.app.AppCompatDelegate;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/*************************************************************
 * Created by OCN.Yang           * * * *   * * * *   *     * *
 * Time:2016/12/6 09:26          *     *   *         * *   * *
 * Email address:yangocn@163.com *     *   *         *   * * *
 * Web site:www.ocnyang.com      * * * *   * * * *   *     * *
 *************************************************************/

/**
 * LayoutInflaterFactory的方式改变TextView的字体。
 */

public class IconFontLayoutFactory implements LayoutInflaterFactory {

    public static final String ICON_FONT = "fonts/iconfont.ttf";
    private static Typeface sTypeface;
    private AppCompatDelegate mAppCompatDelegate;

    public IconFontLayoutFactory(Context context,
                                 AppCompatDelegate appCompatDelegate) {
        if (sTypeface == null) {
            sTypeface = Typeface.createFromAsset(context.getAssets(),
                    ICON_FONT);
        }
        mAppCompatDelegate = appCompatDelegate;
    }

    @Override
    public View onCreateView(View parent, String name, Context context,
                             AttributeSet attrs) {
        View view = mAppCompatDelegate.createView(parent, name, context, attrs);
        if (view instanceof TextView) {
            ((TextView) view).setTypeface(sTypeface);
        }
        return view;
    }
}
