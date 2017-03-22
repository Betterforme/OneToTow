package com.example.administrator.onetotow.main.mvp.model;


import com.example.administrator.onetotow.main.generator.User;

import java.util.List;


/**
 * Created by Administrator on 2017/3/22 0022.
 */

public interface BaseDataBridge<T> {
    void addDatas(List<T> datas);
    void errorDatas();
    public interface LoginData {
        public void addData(User user);
        public void errorData();
    }
}
