package com.example.arif.app01_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void finish() {
        super.finish();
        startActivity(new Intent(this, Explicit_IntentActivity.class));
        overridePendingTransition(R.anim.push_up_out, R.anim.push_up_out);
    }
}
