package com.example.administrator.onetotow.main.activity;

import android.util.Log;

import com.example.administrator.onetotow.R;
import com.example.administrator.onetotow.main.widget.BaseActivity;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import greendao.greendao.User;

public class MainActivity extends BaseActivity {


    @Override
    public void getData() {
        BmobUser.loginByAccount("liuyu", "497045289@qq.com", new LogInListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if(user!=null){
                    Log.i("smile","用户登陆成功");
                }
            }
        });
    }

    @Override
    public void setView() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
