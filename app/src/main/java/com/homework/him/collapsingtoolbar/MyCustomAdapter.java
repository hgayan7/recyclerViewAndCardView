package com.homework.him.collapsingtoolbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by him on 6/15/2017.
 */

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewHolder> {

    Context context;
    LayoutInflater layoutInflater;
    ArrayList<Information> data;
    public MyCustomAdapter(Context context, ArrayList<Information> data) {
        this.context=context;
        this.data=data;
        layoutInflater=LayoutInflater.from(context);
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View view= layoutInflater.inflate(R.layout.card_view,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, final int position) {
        final Information info=data.get(position);
    myViewHolder.textview.setText(data.get(position).title);
    myViewHolder.imageView.setImageResource(data.get(position).imageId);
    myViewHolder.starsText.setText(data.get(position).starsCount+" stars");

    myViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(context, "Clicked at postion"+position, Toast.LENGTH_SHORT).show();
        }
    });
     myViewHolder.imageView.setOnLongClickListener(new View.OnLongClickListener() {
         @Override
         public boolean onLongClick(View v) {
             Toast.makeText(context, "Long Clicked at position"+position, Toast.LENGTH_SHORT).show();
             return true;
         }
     });
    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textview,starsText;
        ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textview=(TextView)itemView.findViewById(R.id.txt_row);
            starsText=(TextView)itemView.findViewById(R.id.starsText);
            imageView=(ImageView)itemView.findViewById(R.id.img_row);

        }
    }
}
