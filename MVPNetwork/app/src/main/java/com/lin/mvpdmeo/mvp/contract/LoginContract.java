package com.lin.mvpdmeo.mvp.contract;

import com.lin.mvpdmeo.mvp.base.BaseModel;
import com.lin.mvpdmeo.mvp.base.BaseModelPresenter;
import com.lin.mvpdmeo.mvp.base.BaseSimplePresenter;
import com.lin.mvpdmeo.mvp.base.BaseView;

/**
 * 契约类
 */
public interface LoginContract {
    interface Model extends BaseModel {

        void login();
    }
    interface View extends BaseView {

    }

    interface Presenter{
        /**
         * 登录
         */
        void login();
    }
}
