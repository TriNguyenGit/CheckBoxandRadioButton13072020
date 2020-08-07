package com.example.checkboxandradiobutton13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    CheckBox mCBAndroid, mCBIos, mCBPhp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCBAndroid = findViewById(R.id.chkandroid);
        mCBIos = findViewById(R.id.chkios);
        mCBPhp = findViewById(R.id.chkphp);

        mCBAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                
            }
        });
    }
}