package com.example.ayush.materialdesignapplication;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ayush on 9/29/2017.
 */

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{
    //adapter class extending the recyclerview.adapter
    private ArrayList<String> list;
    private Context context;
    //declaring list and context
    //parametrized constructor with context and arraylist as parameters
    public adapter(Context context,ArrayList<String> list) {
        super();
        this.list = list;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating the row layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        ViewHolder viewholder = new ViewHolder(view);
        //returning view holder
        return viewholder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //setting textview
        holder.textview.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        //returning size of list
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cardview;
        public TextView textview;
        public ViewHolder(View itemView) {

            super(itemView);
            //associating cardlayout and Textview from row.XML
            textview = (TextView)itemView.findViewById(R.id.textview );
            cardview = (CardView)itemView.findViewById(R.id.cardView);
        }
    }
}
