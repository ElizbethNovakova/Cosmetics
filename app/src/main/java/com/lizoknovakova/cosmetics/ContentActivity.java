package com.lizoknovakova.cosmetics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    private int category;
    private int position;
    private int [] medik_text_content = {R.string.content_medik_0, R.string.content_medik_1, R.string.content_medik_2, R.string.content_medik_3};
    private int [] medik_position = {R.string.position_medik_0, R.string.position_medik_1, R.string.position_medik_2, R.string.position_medik_3};
    private int [] medik_image = {R.drawable.medik_0, R.drawable.medik_1, R.drawable.medik_2, R.drawable.medik_3};

    private TextView title;
    private TextView textContent;
    private TextView price;
    private ImageView imageContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        title = findViewById(R.id.title);
        textContent = findViewById(R.id.text_content);
        price = findViewById(R.id.price);
        imageContent = findViewById(R.id.imageView);

        receiveIntent();
    }

    public void receiveIntent(){
        Intent intent = getIntent();

        if(intent != null){
            category = intent.getIntExtra("CATEGORY_KEY", 0);
            position = intent.getIntExtra("POSITION_KEY", 0);
        }

        switch (position){
            case 0:
                title.setText(medik_position[0]);
                textContent.setText(medik_text_content[0]);
                imageContent.setImageResource(medik_image[0]);
                break;
            case 1:
                title.setText(R.string.position_medik_1);
                textContent.setText(medik_text_content[1]);
                imageContent.setImageResource(medik_image[1]);
                break;
            case 2:
                title.setText(medik_position[2]);
                textContent.setText(medik_text_content[2]);
                imageContent.setImageResource(medik_image[2]);
                break;
            case 3:
                title.setText(medik_position[3]);
                textContent.setText(medik_text_content[3]);
                imageContent.setImageResource(medik_image[3]);
                break;
        }
    }
}