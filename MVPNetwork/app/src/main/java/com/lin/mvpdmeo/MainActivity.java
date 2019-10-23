package com.lin.mvpdmeo;
import android.content.Context;
import android.os.Bundle;
import com.lin.mvpdmeo.mvp.base.BaseMVPActivity;
import com.lin.mvpdmeo.mvp.presenter.MainPresenter;

public class MainActivity extends BaseMVPActivity<MainPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void onEmpty(Object tag) {

    }

    @Override
    public void onError(Object tag, String errorMsg) {

    }

    @Override
    public void showResult(Object bean) {

    }

    @Override
    public Context getContext() {
        return null;
    }
}
