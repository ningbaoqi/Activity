package com.shop.ningbaoqi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

public class FifActivity extends Activity {
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.sample_text);
        textView.setText("five");
        Intent intent = new Intent(this, SixActivity.class);
        /**
         * 启动activity并且要求返回数据
         * */
        startActivityForResult(intent, 0);
    }
    /**
     * 当数据返回时，此方法调用
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0 && resultCode == 1) {
            String da = data.getStringExtra("hello");
            Toast.makeText(FifActivity.this, da, Toast.LENGTH_LONG).show();
            textView.setText(da);
        }
    }
}
