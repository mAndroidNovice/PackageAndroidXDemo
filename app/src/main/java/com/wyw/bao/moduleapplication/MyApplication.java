package com.wyw.bao.moduleapplication;

import android.app.Application;

import com.wyw.bao.leancloud.LeanCouldInit;
import com.wyw.bao.moduleapplication.ui.login.LoginActivity;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeanCouldInit.init(this,
                "KTC638B24grGCB2a3ab5Yde2-gzGzoHsz",
                "x8GBvNSPOzmHFvzneFOu5lE8",
                LoginActivity.class,
                "bao1",
                "5e58f3ba8a84ab008eb309db");
    }
}
