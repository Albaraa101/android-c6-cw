package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Items> item = new ArrayList<>();

        Items cheese = new Items("cheese",R.drawable.cheese,2.0);
        item.add(cheese);
        Shapes_Adapter ShapesAdapter = new Shapes_Adapter(this,0,item);

        ListView listview = findViewById(R.id.listView);
        listview.setAdapter((ShapesAdapter));

    }
}