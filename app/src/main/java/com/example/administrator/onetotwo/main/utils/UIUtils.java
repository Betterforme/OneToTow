package com.example.administrator.onetotwo.main.utils;


import android.content.Context;

import com.example.administrator.onetotwo.App;


/**
 * by y on 2016/4/28.
 */

public class UIUtils {


    public static Context getContext() {
        return App.getContext();
    }

    public static String getString(int id) {
        return getContext().getResources().getString(id);
    }
}
