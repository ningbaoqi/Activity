package com.shop.ningbaoqi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class SixActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.putExtra("hello", "message");
        /**
         * 设置返回数据 ，此activity一旦销毁，这个数据就会传递到此activity的调用者
         * */
        setResult(1, intent);
        /**
         * 销毁activity
         * */
        finish();
    }
}