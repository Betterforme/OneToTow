package com.example.administrator.onetotwo.main.activity;

import com.example.administrator.onetotwo.R;
import com.example.administrator.onetotwo.main.mvp.presenter.LoginPresenterImpl;
import com.example.administrator.onetotwo.main.mvp.view.LoginView;
import com.example.administrator.onetotwo.main.widget.BaseActivity;

public class MainActivity extends BaseActivity implements LoginView {

    LoginPresenterImpl loginPresenter;

    @Override
    public void getData() {
        loginPresenter = new LoginPresenterImpl(this);
        loginPresenter.login("liuyu","497045289@qq.com");
    }

    @Override
    public void setView() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void loginSuccess() {
        toast("登陆成功");
    }

    @Override
    public void loginFailue() {
        toast("登陆失败");
    }
}
