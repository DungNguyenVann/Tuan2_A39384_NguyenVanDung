package com.example.bt.Tuan2.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.bt.R;

public class Tuan2_MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_main);

        txt1 = findViewById(R.id.tuan2txt1);
        txt2 = findViewById(R.id.tuan2txt2);

        btn1 = findViewById(R.id.tuan2btn1);

        btn1.setOnClickListener(v->{

            Intent i =new Intent(Tuan2_MainActivity.this,Tuan2_SecondActivity.class);
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2", txt2.getText().toString());

            startActivity(i);
        });
    }

}