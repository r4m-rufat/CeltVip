package com.codingwithrufat.celttask.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codingwithrufat.celttask.R;

public class HorizontalReviewRecyclerAdapter extends RecyclerView.Adapter<HorizontalReviewRecyclerAdapter.ViewHolder> {

    private Context context;

    public HorizontalReviewRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public HorizontalReviewRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_review_items, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalReviewRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
