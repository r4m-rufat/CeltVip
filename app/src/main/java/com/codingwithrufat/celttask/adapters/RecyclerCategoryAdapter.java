package com.codingwithrufat.celttask.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.codingwithrufat.celttask.activities.CategoryExamActivity;
import com.codingwithrufat.celttask.R;
import com.codingwithrufat.celttask.activities.CategoryExamResultActivity;
import com.codingwithrufat.celttask.models.Category;

import java.util.List;

public class RecyclerCategoryAdapter extends RecyclerView.Adapter<RecyclerCategoryAdapter.ViewHolder>{

    private Context context;
    private List<Category> categories;

    public RecyclerCategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public RecyclerCategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_category_grid_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerCategoryAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.title.setText(categories.get(position).getTitle());
        holder.imageCategory.setImageDrawable(ContextCompat.getDrawable(context, categories.get(position).getImage()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 1){
                    context.startActivity(new Intent(context, CategoryExamActivity.class));
                }else if (position == 2){
                    context.startActivity(new Intent(context, CategoryExamResultActivity.class));
                }else{
                    context.startActivity(new Intent(context, CategoryExamActivity.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView imageCategory;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt_title);
            imageCategory = itemView.findViewById(R.id.imageCategory);
        }
    }

}
