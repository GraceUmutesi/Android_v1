package com.example.gym_flex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.goTo) Button mShowList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mShowList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent link = new Intent(MainActivity.this, nameListActivity.class);
                startActivity(link);
            }
        });
    }
}
