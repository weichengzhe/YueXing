package com.libai.yuexing;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

/**
 * Created by B41-80 on 2016/4/16.
 */
public class LoginActivity extends  AbstractBaseActivity {
    AppCompatButton loginBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {
        loginBt = (AppCompatButton) findViewById(R.id.btn_login);
        loginBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });
    }

}