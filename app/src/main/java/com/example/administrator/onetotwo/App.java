package com.example.administrator.onetotwo;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.administrator.onetotwo.main.constant.Constant;
import com.example.administrator.onetotwo.main.generator.DaoMaster;
import com.example.administrator.onetotwo.main.generator.DaoSession;
import com.example.administrator.onetotwo.main.utils.SQLiteOpenHelper;

import cn.bmob.v3.Bmob;

/**
 * Created by SJ on 2016/11/8.
 */

public class App extends Application {
    Constant constant;
    public  static Application application;
    private SQLiteDatabase db;
    private DaoMaster daoMaster;
    static private DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        Bmob.initialize(this, "256324b5789d783a4bc0c5af44d84887");
        setupDatabase();
        //第二：自v3.4.7版本开始,设置BmobConfig,允许设置请求超时时间、文件分片上传时每片的大小、文件的过期时间(单位为秒)，
        //BmobConfig config =new BmobConfig.Builder(this)
        ////设置appkey
        //.setApplicationId("Your Application ID")
        ////请求超时时间（单位为秒）：默认15s
        //.setConnectTimeout(30)
        ////文件分片上传时每片的大小（单位字节），默认512*1024
        //.setUploadBlockSize(1024*1024)
        ////文件的过期时间(单位为秒)：默认1800s
        //.setFileExpiration(2500)
        //.build();
        //Bmob.initialize(config);
    }

    public static Context getContext(){
        return application;
    }

    public void setupDatabase() {
        // 发布用
        SQLiteOpenHelper helper = new SQLiteOpenHelper(this, null);
        db = helper.getWritableDatabase();
        // 注意：该数据库连接属于 DaoMaster，所以多个 Session 指的是相同的数据库连接。
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public  static DaoSession getDaoSession(){
        return daoSession;
    }
}
