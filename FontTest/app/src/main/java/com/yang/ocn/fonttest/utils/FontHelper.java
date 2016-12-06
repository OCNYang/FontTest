package com.yang.ocn.fonttest.utils;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/*************************************************************
 * Created by OCN.Yang           * * * *   * * * *   *     * *
 * Time:2016/12/5 17:56          *     *   *         * *   * *
 * Email address:yangocn@163.com *     *   *         *   * * *
 * Web site:www.ocnyang.com      * * * *   * * * *   *     * *
 *************************************************************/

/**
 * 循环递归的方式给TextView设置字体。
 */

public class FontHelper {

    public static final String DEF_FONT = "fonts/fontawesome-webfont.ttf";

    public static void injectFont(View rootView) {
        injectFont(rootView, Typeface.createFromAsset(rootView.getContext().getAssets(),
                DEF_FONT));
    }

    private static void injectFont(View rootView, Typeface typeface) {
        if (rootView instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) rootView;
            int childViewCount = viewGroup.getChildCount();
            for (int i = 0; i < childViewCount; i++) {
                injectFont(viewGroup.getChildAt(i), typeface);
            }
        } else if (rootView instanceof TextView) {
            ((TextView) rootView).setTypeface(typeface);
        }
    }
}
