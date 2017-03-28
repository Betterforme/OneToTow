package com.example.administrator.onetotwo.main.widget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.administrator.onetotwo.main.utils.ActivityCollector;
import com.example.administrator.onetotwo.main.utils.LogUtils;
import com.example.administrator.onetotwo.main.utils.RxUtils;

import butterknife.ButterKnife;

/**
 * by y on 2016/4/28.
 */
public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        LogUtils.i("BaseActivity", getClass().getSimpleName());
        ButterKnife.bind(this);
        ActivityCollector.addActivity(this);
        getData();
        setView();
    }

    protected void toast(String content) {
        Toast.makeText(this, content, Toast.LENGTH_LONG).show();
    }

    protected abstract int getLayoutId();
    public void getData(){}
    public void setView(){}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        RxUtils.getInstance().unSubscription();
    }

    protected void toAcitivty(Class t){
        startActivity(new Intent(this,t));
    }

    protected void toActivityForResult(Bundle bundle,Class t,int requst_code){
        Intent intent = new Intent(this,t);
        intent.putExtras(bundle);
        startActivityForResult(intent,requst_code);
    }
}
