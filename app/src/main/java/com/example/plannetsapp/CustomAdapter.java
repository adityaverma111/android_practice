package com.example.plannetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Planet> {

    //Using custom layout --> MYCustomAdapter
    //Using Custom Object --> extends ArrayAdapter<Planet>

    private ArrayList<Planet> planetArraylist;
    Context context;

    public CustomAdapter(ArrayList<Planet> planetArraylist, Context context1) {
        super(context1, R.layout.item_list_layout, planetArraylist);
        this.planetArraylist = planetArraylist;
        this.context = context;

    }

    //View holder class: used to cache references to views within an item layout
    //so that they dont need to be repeadly looked up during scrolling
    private static class MyViewHolder{
        TextView planetname;
        TextView moonname;
        ImageView planetIMmg;

    }
    //getView();used to create and return a view for a
    //specific item in the list

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      //1.Get the planet object for the current position
        Planet planet = getItem(position);
        //2.Inflate Layout:
        MyViewHolder myViewHolder;
        final View result;

        if(convertView==null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            );
            //Find views
            myViewHolder.planetname = (TextView) convertView.findViewById(R.id.planets_name);
            myViewHolder.moonname = (TextView) convertView.findViewById(R.id.moonname);
            myViewHolder.planetIMmg = (ImageView) convertView.findViewById(R.id.imageview);

            result = convertView;
            //settag and gettag method
            convertView.setTag(myViewHolder);
        }else {
            //the viw is recycled
            myViewHolder= (MyViewHolder) convertView.getTag();
            result= convertView;
        }
        myViewHolder.planetname.setText(planet.getPlanetName());
        myViewHolder.moonname.setText(planet.getMoonCount());
        myViewHolder.planetIMmg.setImageResource(planet.getPlanetImage());

        return result;
    }
}



