package com.example.floatingactionbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);




    }


    public void b(View view) {
        Intent a= new Intent(this, MainActivity.class);
        startActivity(a);

    }

    public void c(View view) {
        Intent c= new Intent(this, MainActivity2.class);
        startActivity(c);
    }

    public void r(View view) {
        Intent r= new Intent(this, MainActivity3.class);
        startActivity(r);
    }
}
