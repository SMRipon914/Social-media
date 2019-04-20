package com.example.socialmedia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public  class MyAdepter2 extends RecyclerView.Adapter<MyAdepter2.MyViewHolder> {

    Context context;
    RecyclerView recyclerView;
    String [] name;
    int [] img;

    public MyAdepter2(Context context, String[] name, int[] img) {

        this.context = context;
        this.name = name ;
        this.img = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
       View view= layoutInflater.inflate(R.layout.simple_layout2,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.textView.setText(name[i]);
        myViewHolder.imageView.setImageResource(img[i]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);

            imageView = itemView.findViewById(R.id.imageView);
        }

          }


}
