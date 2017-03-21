package com.example.administrator.onetotow.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.administrator.onetotow.R;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import greendao.User;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BmobUser.loginByAccount("liuyu", "497045289@qq.com", new LogInListener<User>() {

            @Override
            public void done(User user, BmobException e) {
                if(user!=null){
                    Log.i("smile","用户登陆成功");
                }
            }
        });
    }
}
