package com.example.gym_flex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class nameListActivity extends AppCompatActivity {
    private Button mFindProgramButton;
    private EditText mProgramName;
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

        mProgramName =(EditText) findViewById(R.id.programText);
        mFindProgramButton = (Button) findViewById(R.id.nextButton);
        mFindProgramButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                String program = mProgramName.getText().toString();
                Intent intent = new Intent(nameListActivity.this, ListActivity.class);
                intent.putExtra("program",program);
                startActivity(intent);

            }

        });

    }
}
