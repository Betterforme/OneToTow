package com.example.administrator.onetotow.main.mvp.presenter;

/**
 * by y on 2016/5/27.
 */

public class BasePresenterImpl<T> {

    T view;

    public BasePresenterImpl(T view) {
        this.view = view;
    }

}
