package com.example.administrator.onetotwo.main.utils;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import com.example.administrator.onetotwo.main.constant.Constant;


/**
 * by y on 2016/5/4.
 */
public class CompetenceUtils {

    public static void storage(Activity activity) {
        if (ContextCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, Constant.WRITE_EXTERNAL_STORAGE_REQUEST_CODE);
        }
    }

}
