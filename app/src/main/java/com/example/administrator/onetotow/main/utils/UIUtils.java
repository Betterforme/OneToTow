package com.example.administrator.onetotow.main.utils;


import android.content.Context;

import com.example.administrator.onetotow.App;


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
