package com.example.recyclerviewadapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by DEll1 on 1/12/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {

    MainActivity context;
    String[] country;
    String[] capitals;

    public MyAdapter(MainActivity context, String[] capitals, String[] country) {
        this.context = context;
        this.country = country;
        this.capitals = capitals;

    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.single_row, parent,false);
        myViewHolder vh = new myViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        holder.textView1.setText(country[position]);
        holder.textView2.setText(capitals[position]);
    }

    @Override
    public int getItemCount() {
        return country.length;


    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        TextView textView1;
        TextView textView2;


        public myViewHolder(View itemView) {
            super(itemView);
            textView1 = (TextView) itemView.findViewById(R.id.country_names);
            textView2 = (TextView) itemView.findViewById(R.id.country_capitals);
        }
    }


}
