package com.example.arif.app01_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Explicit_IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit__intent);
    }

    public void process(View view)
    {
//        First method of adding Intent
//        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//        startActivity(intent);

//        Second method of addding Intent
//        startActivity(new Intent(this, SecondActivity.class));


        /*
        How to create custom animated Intent
        step1:   Right Click on res folder -> New -> Android Resource Dictionary
                 Set Resource type as "anim" and Directory name as "anim"
        step2:   Right click on anim folder -> New -> Animation Resource File
                 give a name as "slide_in_left" and add the following code
                 "<?xml version="1.0" encoding="utf-8"?>
                    <set xmlns:android="http://schemas.android.com/apk/res/android"
                        android:shareInterpolator="false" >
                        <translate android:duration="1000" android:fromXDelta="-100%" android:toXDelta="0%"/>
                        <alpha android:duration="1000" android:fromAlpha="0.0" android:toAlpha="1.0" />
                    </set>"

                    Complet source code is available on
                    http://www.mysamplecode.com/2013/02/android-animation-switching-activity.html
        */
        finish();
        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_in_left);


    }
}
