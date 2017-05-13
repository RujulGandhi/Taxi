package com.taxi.Activity;

import com.taxi.R;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends BaseActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splush_screen);

        context = SplashScreen.this;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(LoginActivity.class);

            }
        }, 3000);
    }
}
