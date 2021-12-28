package com.codingwithrufat.celttask.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.codingwithrufat.celttask.R;
import com.codingwithrufat.celttask.adapters.HorizontalReviewRecyclerAdapter;
import com.codingwithrufat.celttask.adapters.RecyclerCategoryAdapter;
import com.codingwithrufat.celttask.models.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private RecyclerView recyclerView;
    private List<Category> categoryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeWidgets();
        setupViewPager();
        setupRecyclerView();
    }

    private void initializeWidgets(){

        viewPager2 = findViewById(R.id.viewPager);
        recyclerView = findViewById(R.id.recyclerView);

    }

    private void setupViewPager(){

        HorizontalReviewRecyclerAdapter horizontalReviewRecyclerAdapter = new HorizontalReviewRecyclerAdapter(this);
        viewPager2.setAdapter(horizontalReviewRecyclerAdapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setCurrentItem(2);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);

    }

    private void setupRecyclerView(){
        getData();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new RecyclerCategoryAdapter(this, categoryList));
    }

    private void getData(){
        categoryList.add(new Category("Check-In", R.drawable.ic1));
        categoryList.add(new Category("Exams", R.drawable.ic2));
        categoryList.add(new Category("Exam Results", R.drawable.ic3));
        categoryList.add(new Category("Classes", R.drawable.ic4));
        categoryList.add(new Category("Home Work", R.drawable.ic5));
        categoryList.add(new Category("HW Results", R.drawable.ic6));
        categoryList.add(new Category("Certificate", R.drawable.ic7));
        categoryList.add(new Category("Resources", R.drawable.ic8));
        categoryList.add(new Category("Speakings", R.drawable.ic9));
        categoryList.add(new Category("SP. Reviews", R.drawable.ic10));
        categoryList.add(new Category("Listings", R.drawable.ic11));
        categoryList.add(new Category("Essays", R.drawable.ic12));
        categoryList.add(new Category("Essay Reviews", R.drawable.ic13));
    }

}