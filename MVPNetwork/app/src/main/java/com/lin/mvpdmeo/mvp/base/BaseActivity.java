package com.lin.mvpdmeo.mvp.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * BaseActivity
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {

    protected abstract void getValue();

    protected abstract int getContentView();

    protected abstract void onViewCreated(Bundle savedInstanceState);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getValue();
        setContentView(getContentView());
        onViewCreated(savedInstanceState);
    }
}
