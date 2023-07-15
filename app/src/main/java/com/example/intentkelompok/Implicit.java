package com.example.intentkelompok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Implicit extends AppCompatActivity {

    private  EditText nWebsiteEditText;
    private  EditText nShareTextEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        nWebsiteEditText =  (EditText)findViewById(R.id.website_edittext);
        nShareTextEditText =  (EditText)findViewById(R.id.share_edittext);
    }

    public void openWebsite(View v){
        String url = nWebsiteEditText.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void shareText(View v){
        String txt = nShareTextEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with: ")
                .setText(txt)
                .startChooser();

    }
}