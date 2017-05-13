package com.taxi.Activity;

import com.taxi.R;

import android.os.Bundle;
import android.widget.Button;

/**
 * Created by AMD21 on 13/5/17.
 */

public class LoginActivity extends BaseActivity {

    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    void init() {

    }
}
