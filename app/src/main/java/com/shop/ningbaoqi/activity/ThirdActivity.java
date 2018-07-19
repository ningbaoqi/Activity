package com.shop.ningbaoqi.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * 可以跳转到本应用中的activity，也可以跳转到第三方的acitivity，并且通过data中的scheme和mineType传递数据；
 */
public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 使用隐式跳转,需要设置action
         * */
        Intent intent = new Intent();
        intent.putExtra("dashuaige", "wo");

        Bundle bundle = new Bundle();
        bundle.putString("caonima", "nimendoushifashabi");
        intent.putExtra("bundle", bundle);
        /**
         * 隐式跳转到第三方Activity
         * */
//        intent.setAction(Intent.ACTION_CALL);
        /**
         * 隐式跳转到本应用中的activity
         * */
        intent.setAction("caonige");
        /**
         * 其中ningbaoqi:是必须写的，要匹配配置文件
         * */
        intent.setDataAndType(Uri.parse("ningbaoqi:12312312"), "text/username");
        startActivity(intent);
    }
}
