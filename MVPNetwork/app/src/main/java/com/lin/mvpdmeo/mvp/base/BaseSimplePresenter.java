package com.lin.mvpdmeo.mvp.base;

public interface BaseSimplePresenter<V extends BaseView> {
    /**
     * 绑定Presenter
     */
    void attachView(V view);

    /**
     * 解绑Presenter
     */
    void detachView();
}
