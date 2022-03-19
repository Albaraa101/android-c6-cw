package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Shapes_Adapter extends ArrayAdapter<Items> {
    List<Items> item;


    public Shapes_Adapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);

        item = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

       View view = LayoutInflater.from(getContext()).inflate(R.layout.items, parent, false);


        Items currentItems = item.get(position);
        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemPrice = view.findViewById(R.id.itemPrice);
        ImageView itemImage = view.findViewById(R.id.itemImage);

        itemName.setText(currentItems.getItemName());
        itemImage.setImageResource(currentItems.getItemImage());
        itemPrice.setText(currentItems.getItemPrice()+"");

        return view;
    }
}
