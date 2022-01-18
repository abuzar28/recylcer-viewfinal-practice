package com.example.recyclervivewfinalspractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {


    String [] data;
    public Adapter(String []d){
        this.data=d;

    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.layout,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
           holder.txt.setText(data[position]);
           holder.img.setImageResource();

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public Holder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            txt=itemView.findViewById(R.id.text45);
        }
    }


}
