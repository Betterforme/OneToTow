package com.example.administrator.onetotow.main.mvp.presenter;

/**
 * Created by SJ on 2017/3/21.
 */

public class BasePresenter {

    public interface LoginPresenter{
        void login(String username, String secret, LoginPresenterImpl loginPresenter);
    }
}
