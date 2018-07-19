package com.shop.ningbaoqi.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class FourthActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 通过隐式跳转的 data 和 mimetype 传递数据
         * */
        Intent intent = getIntent();
        Uri uri = intent.getData();
        String type = intent.getType();
        Toast.makeText(this, "type:" + type + "--------" + uri.toString(), Toast.LENGTH_LONG).show();
    }
}
