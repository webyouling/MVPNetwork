package com.lin.mvpdmeo.mvp.base;

import android.content.Context;

/**
 * 一般情况下，做数据请求都有显示加载框、请求成功、请求失败等操作，我们把这些共有的功能封装到BaseView中
 */
public interface BaseView {
    /**
     * 显示加载框
     */
    void showLoading();

    /**
     * 隐藏加载框
     */
    void dismissLoading();

    /**
     * 空数据
     *
     * @param tag TAG
     */
    void onEmpty(Object tag);

    /**
     * 错误数据
     *
     * @param tag      TAG
     * @param errorMsg 错误信息
     */
    void onError(Object tag, String errorMsg);

    /**
     * 成功数据
     * @param bean
     */
    void showResult(Object bean);

    /**
     * 上下文
     *
     * @return context
     */
    Context getContext();
}
