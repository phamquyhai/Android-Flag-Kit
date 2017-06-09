package com.haipq.android.flagkit.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.haipq.android.flagkit.FlagImageView;

public class MainActivity extends AppCompatActivity {

    FlagImageView flagImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flagImageView = (FlagImageView) findViewById(R.id.flagView);

    }

    public void currentFlag(View v) {
        flagImageView.defaultLocal();
    }
}
