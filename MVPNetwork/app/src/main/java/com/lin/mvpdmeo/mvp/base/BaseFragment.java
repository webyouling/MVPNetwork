package com.lin.mvpdmeo.mvp.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * BaseFragment
 */
public abstract class BaseFragment extends Fragment implements BaseView{

    protected abstract void getValue();

    protected abstract View inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup container);

    protected abstract void bindView();

    protected Activity mActivity;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mActivity = (Activity) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflate(inflater,container);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getValue();
        bindView();
    }
}
