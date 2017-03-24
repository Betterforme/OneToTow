package com.example.administrator.onetotwo.main.utils;


import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.administrator.onetotwo.R;

/**
 * by y on 2016/4/29.
 */

public class ImageLoaderUtils {

    public static void display(@NonNull ImageView imageView, @NonNull String url, int placeholder, int error) {
        Glide.with(imageView.getContext()).load(url).placeholder(placeholder)
                .error(error).crossFade().into(imageView);
    }

    public static void display(@NonNull ImageView imageView, @NonNull Object url) {
        Glide.with(imageView.getContext()).load(url).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher).crossFade().into(imageView);
    }

    /**
     * @param imageView
     * 家在本地图片
     * @param resource
     */
    public static void display(@NonNull ImageView imageView, @NonNull int resource){
        Glide.with(imageView.getContext()).load(resource).asBitmap().into( imageView ) ;
    }

    /**
     * 清除缓存
     * @param context
     */
    public void clearCache( final Context context ){
        clearMemoryCache( context );
        new Thread(new Runnable() {
            @Override
            public void run() {
                clearDiskCache(  context );
            }
        }).start();
    }

    /**
     * 清除内存缓存
     * @param context
     */
    public void clearMemoryCache( Context context ){
        Glide.get( context ).clearMemory();
    }

    /**
     * 清除磁盘缓存
     * @param context
     */
    public void clearDiskCache( Context context ){
        Glide.get( context ).clearDiskCache();
    }
}
