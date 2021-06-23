package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.foodorder.MainActivity;
import com.example.foodorder.R;

public class Welcome extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable(){
            @Override

            public void run() {
                Intent intent=new Intent(Welcome.this,MainActivity.class);
                startActivity(intent);
                finish();

        }
    }, SPLASH_TIME_OUT);
}

}