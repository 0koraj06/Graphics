package com.example.a0koraj06.graphics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        GraphicsView gView = new GraphicsView(this);
        setContentView(gView);
    }
}
