package com.lin.mvpdmeo.mvp.presenter;

import com.lin.mvpdmeo.mvp.base.BaseModelPresenter;
import com.lin.mvpdmeo.mvp.contract.LoginContract;
import com.lin.mvpdmeo.mvp.model.LoginModel;

public class LoginPresenter extends BaseModelPresenter<LoginContract.Model, LoginContract.View> implements LoginContract.Presenter {
    @Override
    protected LoginContract.Model createModule() {
        return new LoginModel();
    }


    @Override
    public void login() {
        
    }
}
