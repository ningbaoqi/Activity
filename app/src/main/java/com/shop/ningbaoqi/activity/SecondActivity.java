package com.shop.ningbaoqi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 因为指定了跳转的Activity的类名，称为显示跳转;可以跳转到本应用中的activity，也可以跳转到第三方的acitivity
     */
    public void click(View view) {
        Intent intent = new Intent();
        /**
         * 显示跳转到本应用activity
         * */
        intent.setClass(this, MainActivity.class);
        /**
         * 显示跳转到第三方activiy
         * */
        //intent.setClassName("com.android.dialer", "com.android.dialer.DialtactsActivity");
        startActivity(intent);
    }
}
