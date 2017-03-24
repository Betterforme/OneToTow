package com.example.administrator.onetotwo.main.activity;

import com.example.administrator.onetotwo.R;
import com.example.administrator.onetotwo.main.mvp.view.LoginView;
import com.example.administrator.onetotwo.main.widget.BaseActivity;

public class LoginActivity extends BaseActivity implements LoginView{

    @Override
    protected int getLayoutId() {
        return R.layout.activity_loginctivity;
    }

    @Override
    public void getData() {
        super.getData();
    }

    @Override
    public void setView() {
        super.setView();
    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginFailue() {

    }
}
