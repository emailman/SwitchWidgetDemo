package com.example.jonathan.switchwidgetdemo;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.view.View;

import android.widget.Switch;
import android.widget.TextView;
import android.widget.ImageView;

import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Switch newSwitch;
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newSwitch = (Switch)findViewById(R.id.switch1);
        textView = (TextView)findViewById(R.id.textView2);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setVisibility(View.GONE);
        newSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("Wifi is ON");
                    imageView.setVisibility(View.VISIBLE);
                } else {
                    textView.setText("Wifi is OFF");
                    imageView.setVisibility(View.GONE);
                }
            }
        });


    }


}
