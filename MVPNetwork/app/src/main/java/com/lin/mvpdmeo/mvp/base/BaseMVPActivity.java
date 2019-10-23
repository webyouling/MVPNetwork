package com.lin.mvpdmeo.mvp.base;

import android.os.Bundle;

public abstract class BaseMVPActivity<P extends BasePresenter> extends BaseActivity{

    protected P mPresenter;

    protected abstract P createPresenter();

    @Override
    protected void getValue() {

    }

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void onViewCreated(Bundle savedInstanceState) {
        mPresenter = createPresenter();
        if (mPresenter == null) {
            throw new NullPointerException("Presenter is null! Do you return null in createPresenter()?");
        }
        mPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null)
            mPresenter.detachView();
        super.onDestroy();
    }
}
