package com.lin.mvpdmeo.mvp.base;

import java.lang.ref.WeakReference;

public abstract class BaseModelPresenter<M extends BaseModel, V extends BaseView> implements BaseSimplePresenter<V> {
    private WeakReference<V> mView;
    private M module;

    /**
     * 绑定Presenter
     *
     * @param view
     */
    @Override
    public void attachView(V view) {
        mView = new WeakReference<>(view);
        if (this.module == null) {
            this.module = createModule();
        }
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

    /**
     * 通过该方法创建Module
     */
    protected abstract M createModule();

    /**
     * 获取View
     *
     * @return
     */
    protected M getModule() {
        return module;
    }
}
