package com.example.arif.app01_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Implicit_Intent_Activity extends AppCompatActivity {

    Intent intent = null, option = null;
    Button btnsendmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit__intent_);

    }

    public void implicitintent(View view)
    {
        switch (view.getId())
        {
            case R.id.btnsendmail:
                sendmail();
                break;

            case R.id.btnshowplaystore:
                showplaystore();
                break;
        }
    }

    private void showplaystore() {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.nintendo.zara"));
        option = Intent.createChooser(intent, "Launch App");
        startActivity(option);
    }


    private void sendmail()
    {
        intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        String[] to = {"mail.arifh@yahoo.com"};
        intent.putExtra(intent.EXTRA_EMAIL, to);
        intent.putExtra(intent.EXTRA_SUBJECT, "Query Regarding JOB");
        intent.putExtra(intent.EXTRA_TEXT, "Can you please explain about the job description");
        intent.setType("message/rfc822");
        option = Intent.createChooser(intent, "Send Email");
        startActivity(option);
    }
}
