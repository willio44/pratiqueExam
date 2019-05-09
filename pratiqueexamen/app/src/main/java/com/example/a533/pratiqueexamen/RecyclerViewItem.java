package com.example.a533.pratiqueexamen;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewItem extends RecyclerView.Adapter <RecyclerViewItem.MyViewHolder> {
    private List<JobOfferModel> jobOfferModels;
    Context context;
    private MainActivity.onDeleteItem onDeleteItem;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitleJob;
        public TextView textViewDescr;
        public TextView textViewSalary;
        public Button btnRet;


        public MyViewHolder(View v) {
            super(v);
            textViewTitleJob = (TextView) v.findViewById(R.id.textView_Title);
            textViewDescr = (TextView) v.findViewById(R.id.textView_Descr);
            textViewSalary = (TextView) v.findViewById(R.id.textView_salaire);
            btnRet = (Button) v.findViewById(R.id.button_retirer);
        }
    }

    public RecyclerViewItem(List<JobOfferModel> jobOfferModelList, MainActivity.onDeleteItem onDeleteItem) {
        jobOfferModels = jobOfferModelList;
        this.onDeleteItem = onDeleteItem;
    }

    @Override
    public RecyclerViewItem.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_recycler_view_item, parent, false);
        context = parent.getContext();
        RecyclerViewItem.MyViewHolder vh = new RecyclerViewItem.MyViewHolder(view);
        return vh;

    }

    @Override
    public void onBindViewHolder(final RecyclerViewItem.MyViewHolder holder, int position) {
        holder.textViewTitleJob.setText(jobOfferModels.get(position).getTitleJob());
        holder.textViewDescr.setText(jobOfferModels.get(position).getDescription());
        holder.textViewSalary.setText(jobOfferModels.get(position).getSalary().toString());
        holder.btnRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDeleteItem.deleteItem(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return jobOfferModels.size();
    }


}
