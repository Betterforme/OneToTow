package com.example.administrator.onetotow.main.mvp.presenter;


import com.example.administrator.onetotow.main.generator.User;
import com.example.administrator.onetotow.main.mvp.model.BaseDataBridge;
import com.example.administrator.onetotow.main.mvp.model.LoginModelImpl;
import com.example.administrator.onetotow.main.mvp.view.LoginView;


/**
* Created by Administrator on 2017/03/22
*/

public class LoginPresenterImpl extends  BasePresenterImpl implements BasePresenter.LoginPresenter,BaseDataBridge.LoginData{

    private LoginModelImpl loginModel;
    public LoginPresenterImpl(LoginView view) {
        super(view);
        loginModel = new LoginModelImpl();
    }


    @Override
    public void login(String username, String secret) {
        loginModel.login(username,secret,this);
    }

    @Override
    public void addData(User user) {
        ((LoginView)view).loginSuccess();
    }

    @Override
    public void errorData() {
        ((LoginView)view).loginFailue();
    }
}