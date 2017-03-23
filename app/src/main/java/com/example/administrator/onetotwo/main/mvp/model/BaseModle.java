package com.example.administrator.onetotwo.main.mvp.model;

import com.example.administrator.onetotwo.main.mvp.presenter.LoginPresenterImpl;

/**
 * Created by SJ on 2017/3/21.
 */

public interface BaseModle {

   void getDataFromServer();

    public interface Login {
        void login(String username, String secret, LoginPresenterImpl loginPresenter);
    }

}
