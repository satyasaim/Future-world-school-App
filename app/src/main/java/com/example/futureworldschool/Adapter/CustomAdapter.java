package com.example.futureworldschool.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.futureworldschool.Monthlyfee;
import com.example.futureworldschool.Pojo.MonthsData;
import com.example.futureworldschool.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    ArrayList months;
    ArrayList amount;
    MonthsData monthsData;



    public CustomAdapter(Context context, ArrayList months, ArrayList amount) {
        this.context = context;
        this.months = months;
        this.amount = amount;

    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.single_layout,viewGroup,false);

        MyViewHolder vh= new MyViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder,  int position) {

        myViewHolder.month.setText((String) months.get(position));
        myViewHolder.amount.setText((String) amount.get(position));
    }

    @Override
    public int getItemCount() {
        return months.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView month;
        TextView amount;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //get the reference of item.view
            month = itemView.findViewById(R.id.namemonth);
            amount = itemView.findViewById(R.id.amount);

        }
    }
}
