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

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {
    @BindView(R.id.programText)TextView mProgramTextView;
    @BindView(R.id.listView)ListView mAllList;


    private String[] sportNames = new String[] {"Downward Dog", "Child Pose",
            "Easy Pose", "Bridge", "Warrior 1", "Warrior 2",
            "Trikonasana", "Chaturanga", "Chair", "Tree",
            "Navasana", "Bakasana", "Arm Balance",
            "Savasana", "King Dancer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, sportNames);
        mAllList.setAdapter(adapter);
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
    }
}
