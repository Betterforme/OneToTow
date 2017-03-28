package com.example.administrator.onetotwo.main.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.onetotwo.R;
import com.example.administrator.onetotwo.main.mvp.presenter.LoginPresenterImpl;
import com.example.administrator.onetotwo.main.mvp.view.LoginView;
import com.example.administrator.onetotwo.main.widget.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;
import top.wefor.circularanim.CircularAnim;

public class LoginActivity extends BaseActivity implements LoginView {

    private LoginPresenterImpl loginPresenter;

    @BindView(R.id.tv_lable)
    TextView tvLable;
    @BindView(R.id.imgWxLogin)
    ImageView imgWxLogin;
    @BindView(R.id.rl_weixing)
    RelativeLayout rlWeixing;
    @BindView(R.id.imgQQLogin)
    ImageView imgQQLogin;
    @BindView(R.id.rl_qq)
    RelativeLayout rlQq;
    @BindView(R.id.imgSinaLogin)
    ImageView imgSinaLogin;
    @BindView(R.id.rl_weibo)
    RelativeLayout rlWeibo;
    @BindView(R.id.ll_share)
    LinearLayout llShare;
    @BindView(R.id.et_account)
    EditText etAccount;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.rl_login)
    RelativeLayout rlLogin;
    @BindView(R.id.tv_learn_more)
    TextView tvLearnMore;
    @BindView(R.id.rl_about_us)
    RelativeLayout rlAboutUs;
    @BindView(R.id.tv_regist)
    TextView tvRegist;
    @BindView(R.id.rl_regist)
    RelativeLayout rlRegist;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
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
        toMainActivity(rlLogin);
    }

    @Override
    public void loginFailue() {

    }


    @OnClick({R.id.rl_weixing, R.id.rl_qq, R.id.rl_weibo, R.id.rl_login, R.id.rl_about_us, R.id.rl_regist})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_weixing:
//                CircularAnim.show(rlWeixing).go();
                break;
            case R.id.rl_qq:
//                CircularAnim.hide(llShare).triggerView(rlQq).go();
                break;
            case R.id.rl_weibo:
//                CircularAnim.show(llShare).triggerView(rlWeibo).go();
                break;
            case R.id.rl_login:
                loginPresenter = new LoginPresenterImpl(this);
                loginPresenter.login("liuyu","497045289@qq.com");
                break;
            case R.id.rl_about_us:
                break;
            case R.id.rl_regist:
                break;
        }
    }

    private void toMainActivity(View v){
        CircularAnim.fullActivity(LoginActivity.this, v)
                .colorOrImageRes(R.color.colorPrimary)
                .go(new CircularAnim.OnAnimationEndListener() {
                    @Override
                    public void onAnimationEnd() {
                        toAcitivty(MainActivity.class);
                    }
                });
    }

}
