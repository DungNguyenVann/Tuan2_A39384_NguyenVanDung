package com.example.bt.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.bt.R;

public class Tuan2_ListViewMainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_list_view_main);

        lv= findViewById(R.id.tuan2ListView);

        String[] arr =new String[]{"Mon 1","Tuan 2","Mon 3","Mon 4","Mon 5","Tuan 6", "aaa","bbb"};

        ArrayAdapter<String> adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);

        lv.setAdapter(adapter);
    }
}