package com.taxi.Activity;

import com.taxi.R;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Rujul on 5/13/2017.
 */

public class OTPActivity extends BaseActivity implements View.OnClickListener {
    Button confirmBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        setCursorPostion();
    }

    @Override
    protected void onStart() {
        super.onStart();
        confirmBtn = (Button) findViewById(R.id.activity_otp_confirm);
        confirmBtn.setOnClickListener(this);
    }

    private void setCursorPostion() {
        ((EditText) findViewById(R.id.edi1)).addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (((EditText) findViewById(R.id.edi1)).getText().toString().length() == 1) {
                    ((EditText) findViewById(R.id.edi1)).clearFocus();
                    ((EditText) findViewById(R.id.edi2)).requestFocus();
                    ((EditText) findViewById(R.id.edi2)).setCursorVisible(true);

                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub
            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }


        });

        ((EditText) findViewById(R.id.edi2)).addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (((EditText) findViewById(R.id.edi2)).getText().toString().length() == 1) {
                    ((EditText) findViewById(R.id.edi2)).clearFocus();
                    ((EditText) findViewById(R.id.edi3)).requestFocus();
                    ((EditText) findViewById(R.id.edi3)).setCursorVisible(true);

                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }


        });


        ((EditText) findViewById(R.id.edi3)).addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (((EditText) findViewById(R.id.edi3)).getText().toString().length() == 1) {
                    ((EditText) findViewById(R.id.edi3)).clearFocus();
                    ((EditText) findViewById(R.id.edi4)).requestFocus();
                    ((EditText) findViewById(R.id.edi4)).setCursorVisible(true);

                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }


        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_otp_confirm:
                startActivity(MainActivity.class);
                break;
        }
    }
}
