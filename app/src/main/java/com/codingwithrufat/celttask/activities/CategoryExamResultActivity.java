package com.codingwithrufat.celttask.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.codingwithrufat.celttask.R;

public class CategoryExamResultActivity extends AppCompatActivity {

    TextView buttonText;
    CardView backCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_exam_result);

        buttonText = findViewById(R.id.txtButtonBack);
        backCardView = findViewById(R.id.backCardView);

        buttonText.setText("Exam Results");

        backCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}