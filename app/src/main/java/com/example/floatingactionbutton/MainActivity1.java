package com.example.floatingactionbutton;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {
    private FABToolbarLayout morph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        morph = (FABToolbarLayout) findViewById(R.id.fabtoolbar);

        View uno, dos, tres, cuatro;

        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        cuatro = findViewById(R.id.cuatro);
        tres = findViewById(R.id.tres);

        fab.setOnClickListener((View.OnClickListener) this);
        uno.setOnClickListener((View.OnClickListener) this);
        dos.setOnClickListener((View.OnClickListener) this);
        tres.setOnClickListener((View.OnClickListener) this);
        cuatro.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fab) {
            morph.show();
        }

        morph.hide();
    }
}