package com.taxi.Activity;

import com.taxi.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by AMD21 on 13/5/17.
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btn_login = (Button) findViewById(R.id.activity_login_btn);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_login_btn:

                startActivity(OTPActivity.class);

                break;
        }
    }
}
