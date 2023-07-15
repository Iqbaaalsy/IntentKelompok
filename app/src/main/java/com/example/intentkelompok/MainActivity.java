package com.example.intentkelompok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBukaSatu, btnBukadua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBukaSatu = (Button) findViewById(R.id.btnBukaSatu);
        btnBukadua = (Button) findViewById(R.id.btnBukaDua);

        btnBukaSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActSatu = new Intent(getApplicationContext(), SatuActivity.class);
                startActivity(BukaActSatu);
            }
        });

        btnBukadua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaDua();
            }
        });
    }

    public void BukaDua(){
        Intent BukaActDua = new Intent(getApplicationContext(), DuaActivity.class);
        startActivity(BukaActDua);
    }
}