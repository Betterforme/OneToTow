package com.example.administrator.onetotow.main.mvp.model;


import android.util.Log;

import com.example.administrator.onetotow.main.mvp.presenter.LoginPresenterImpl;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import greendao.greendao.User;

/**
* Created by Administrator on 2017/03/22
*/

public class LoginModelImpl implements BaseModle.Login{

    //账号：liuyu 密码:497045289@qq.com
    @Override
    public void login(String username, String secret, LoginPresenterImpl loginPresenter) {
        BmobUser.loginByAccount(username, secret, new LogInListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if(user!=null){
                    Log.i("smile","用户登陆成功");
                    loginPresenter.addData(user);
                }else {
                    loginPresenter.errorData();
                }
            }
        });
    }
}