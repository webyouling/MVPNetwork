package com.lin.mvpdmeo.mvp.base;

import java.lang.ref.WeakReference;

/**
 * 控制器基类：
 * View的绑定和解除，P层实现的基类
 * @param <V>
 */
public abstract class BasePresenter<V extends BaseView> implements BaseSimplePresenter<V> {
    private WeakReference<V> mView;

    /**
     * 绑定Presenter
     *
     * @param view
     */
    @Override
    public void attachView(V view) {
        mView = new WeakReference<>(view);
    }

    /**
     * 解绑Presenter
     */
    @Override
    public void detachView() {
        if (mView != null) {
            mView.clear();
            mView = null;
        }
    }

    /**
     * 获取View
     *
     * @return
     */
    protected V getView() {
        if (mView == null)
            return null;
        return mView.get();
    }

    /**
     * 是否已经关联
     *
     * @return
     */
    protected boolean isViewAttached() {
        return mView != null && mView.get() != null;
    }

}
