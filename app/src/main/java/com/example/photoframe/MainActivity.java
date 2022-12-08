package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    int[] img1 = {R.drawable.grid, R.drawable.o, R.drawable.x, R.drawable.inr, R.drawable.ic_launcher_background};

    public void nxt(View view)
    {
        if(i==4)
        {
            Toast toast = Toast.makeText(this, "No more images", Toast.LENGTH_SHORT);
            toast.show();
        }
        else
        {
            i+=1;
            ImageView img = findViewById(R.id.imageView3);
            img.setTranslationY(-1000f);
            img.setImageResource(img1[i]);
            img.animate().translationYBy(1000f).setDuration(300);
        }
    }

    public void prv(View view)
    {
        if(i==0)
        {
            Toast toast = Toast.makeText(this, "No Previous images", Toast.LENGTH_SHORT);
            toast.show();
        }
        else
        {
            i-=1;
            ImageView img = findViewById(R.id.imageView3);
            img.setTranslationY(1000f);
            img.setImageResource(img1[i]);
            img.animate().translationYBy(-1000f).setDuration(300);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}