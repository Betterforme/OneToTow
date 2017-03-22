package com.example.administrator.onetotow.main.mvp.model;


import android.util.Log;

import com.example.administrator.onetotow.App;
import com.example.administrator.onetotow.main.mvp.presenter.LoginPresenterImpl;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import greendao.greendao.User;

/**
* Created by Administrator on 2017/03/22
*/

public class LoginModelImpl implements BaseModle.Login{

    /**
     * @param username liuyu
     * @param secret   497045289@qq.com
     * @param loginPresenter
     */
    @Override
    public void login(String username, String secret, LoginPresenterImpl loginPresenter) {
        BmobUser.loginByAccount(username, secret, new LogInListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if(user!=null){
                    Log.i("smile","用户登陆成功");
                    App.getDaoSession().insertOrReplace(user);
                    loginPresenter.addData(user);
                }else {
                    loginPresenter.errorData();
                }
            }
        });
    }
}