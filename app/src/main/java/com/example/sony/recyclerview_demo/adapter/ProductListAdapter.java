package com.example.sony.recyclerview_demo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sony.recyclerview_demo.R;

import java.util.List;

/**
 * Created by SONY on 5/15/2016.
 */
public class ProductListAdapter extends android.support.v7.widget.RecyclerView.Adapter {

    List<String>mDataset;

    public ProductListAdapter (List<String>mDataset)
    {
        this.mDataset=mDataset;
    }

    public  class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        public ViewHolder (View itemView)
        {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.text_view_name);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from (parent.getContext()).inflate(R.layout.cell_product_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).textView.setText(mDataset.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
