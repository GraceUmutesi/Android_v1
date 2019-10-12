package com.example.gym_flex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class nameListActivity extends AppCompatActivity {
    GridView gridView;
    String[] details = new String[]{
            "Program","Start","End","Beginner","January","April","Medium","May","August","Pro","September","December"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_list);

        gridView = (GridView) findViewById(R.id.longGridView);
        gridView.setAdapter(new ProgramAdapter(this, details));
    }
}
