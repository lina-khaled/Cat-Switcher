package com.example.st.catswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void swtichCat(View view){
    Log.i("Info"," Botton pressed!!");
    ImageView image1 = (ImageView)findViewById(R.id.greyCat);
    image1.setImageResource(R.drawable.brown_cat);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
