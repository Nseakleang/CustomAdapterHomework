package com.seakleang.customadapterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> customAdapter = new ArrayAdapter<>(
                this,
                R.layout.activity_item_list_view,
                R.id.txtTitle
        );

        listView.setAdapter(customAdapter);
    }

}
