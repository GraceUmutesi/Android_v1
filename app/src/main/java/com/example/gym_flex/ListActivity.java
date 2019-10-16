package com.example.gym_flex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class ListActivity extends AppCompatActivity {

    private ListView mAllList ;
    private TextView mProgramTextView;
    private String[] sportNames = new String[] {"Downward Dog", "Child Pose",
            "Easy Pose", "Bridge", "Warrior 1", "Warrior 2",
            "Trikonasana", "Chaturanga", "Chair", "Tree",
            "Navasana", "Bakasana", "Arm Balance",
            "Savasana", "King Dancer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView mAllList=(ListView)findViewById(R.id.listView);
        TextView mProgramTextView =(TextView)findViewById(R.id.uniqueText);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, sportNames);
        mAllList.setAdapter(arrayAdapter);
        mAllList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String sportName = ((TextView)view).getText().toString();
                Toast.makeText(ListActivity.this,sportName, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String program = intent.getStringExtra("program");
        mProgramTextView.setText("The following are the sport available for: " + program);
        System.out.println(program);
    }
}
