package com.example.finstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    private ImageView ivPicture;
    private Button btnCamera;
    private EditText etCaption;
    private Button btnPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivPicture = findViewById(R.id.ivPicture);
        btnCamera = findViewById(R.id.btnCamera);
        etCaption = findViewById(R.id.etCaption);
        btnPost = findViewById(R.id.btnPost);
        
    }
}