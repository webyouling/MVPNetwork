package com.lin.mvpdmeo.mvp.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class BaseMVPFragment<P extends BasePresenter> extends BaseFragment {
    protected P mPresenter;

    protected abstract P createPresenter();

    @Override
    protected void getValue() {

    }

    @Override
    protected View inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        return null;
    }

    @Override
    protected void bindView() {
        mPresenter = createPresenter();
        if (mPresenter == null) {
            throw new NullPointerException("Presenter is null! Do you return null in createPresenter()?");
        }
        mPresenter.attachView(this);
    }

    @Override
    public void onDestroyView() {
        if (mPresenter != null)
            mPresenter.detachView();
        super.onDestroyView();
    }
}
