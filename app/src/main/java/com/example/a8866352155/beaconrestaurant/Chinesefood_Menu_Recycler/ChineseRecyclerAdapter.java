package com.example.a8866352155.beaconrestaurant.Chinesefood_Menu_Recycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.a8866352155.beaconrestaurant.OrderActivity;
import com.example.a8866352155.beaconrestaurant.R;

import java.util.ArrayList;

/**
 * Created by 8866352155 on 3/22/2017.
 */

public class ChineseRecyclerAdapter extends RecyclerView.Adapter<ChineseViewholder>{
    Context context;
    ArrayList<Chinese> foods;
    Intent intent;

    public ChineseRecyclerAdapter(Context context, ArrayList<Chinese> foods) {
        this.context = context;
        this.foods = foods;
    }

    @Override
    public ChineseViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.all_acitivities_model,null);
        ChineseViewholder holder=new ChineseViewholder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ChineseViewholder holder, final int position) {

        holder.img.setImageResource(foods.get(position).getImage());
        holder.nameTxt.setText(foods.get(position).getName());
        holder.price.setText(foods.get(position).getPrice());

        holder.setItemClickListener(new ItemClickListeners() {
            @Override
            public void onItemClick(View v, int pos) {
                Toast.makeText(context,foods.get(pos).getName(),Toast.LENGTH_SHORT).show();
                intent=new Intent(context, OrderActivity.class);
                intent.putExtra("Image",foods.get(position).getImage());
                intent.putExtra("Name",foods.get(position).getName());
                intent.putExtra("Price",foods.get(position).getPrice());
                context.startActivity(intent);

            }

        });
    }

    @Override
    public int getItemCount() {
        return foods.size();

    }
}
