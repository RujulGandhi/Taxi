package com.taxi.Activity;

import com.taxi.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Rujul on 5/14/2017.
 */

public class RegisterActivity extends BaseActivity implements View.OnClickListener {

    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }

    @Override
    protected void onStart() {
        super.onStart();
        registerBtn = (Button) findViewById(R.id.activity_register_btn);
        registerBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_register_btn:

                startActivity(LoginActivity.class);

                break;
        }
    }
}
