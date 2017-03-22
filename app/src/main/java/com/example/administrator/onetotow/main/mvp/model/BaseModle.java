package com.example.administrator.onetotow.main.mvp.model;

import com.example.administrator.onetotow.main.mvp.presenter.LoginPresenterImpl;

/**
 * Created by SJ on 2017/3/21.
 */

public interface BaseModle {

   void getDataFromServer();

    public interface Login {
        void login(String username, String secret, LoginPresenterImpl loginPresenter);
    }

}
