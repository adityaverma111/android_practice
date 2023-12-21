package com.example.plannetsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    ArrayList<Planet> planetArrayList;
    private  static  CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1- AdapterView: a ListView
        listview = findViewById(R.id.listView);

        //2-Data Source:  ArrayList<Planet>
       planetArrayList = new ArrayList<>();
        Planet planet0 = new Planet("Sun","0 Moon",R.drawable.sun);
       Planet planet1 = new Planet("Mercury","0 Moon",R.drawable.mercury);
       Planet planet2 = new Planet("Venus","0 Moon",R.drawable.venus);
       Planet planet3 = new Planet("Earth","1 Moon",R.drawable.earth);
       Planet planet4 = new Planet("Mars","2 Moon",R.drawable.mars);
       Planet planet5 = new Planet("Jupiter","79 Moon",R.drawable.jupiter);
       Planet planet6 = new Planet("Saturn","83 Moon",R.drawable.saturn);
       Planet planet7 = new Planet("Uranus","27 Moon",R.drawable.uranus);
       Planet planet8 = new Planet("Neptune","14 Moon",R.drawable.neptune);

       planetArrayList.add(planet0);
       planetArrayList.add(planet1);
       planetArrayList.add(planet2);
       planetArrayList.add(planet3);
       planetArrayList.add(planet4);
       planetArrayList.add(planet5);
       planetArrayList.add(planet6);
       planetArrayList.add(planet7);
       planetArrayList.add(planet8);


       //Adapter
        adapter = new CustomAdapter(planetArrayList,getApplicationContext());
        listview.setAdapter(adapter);

    }
}