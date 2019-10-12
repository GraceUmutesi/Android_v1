package com.example.gym_flex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ProgramAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mDetails;

    public ProgramAdapter (Context context, String[] details){
        this.mContext = context;
        this.mDetails = details;
    }

    @Override
    public int getCount() {
        return mDetails.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView == null) {
            // get layout from xml file
            gridView = inflater.inflate(R.layout.detail_grid_item, null);
            // pull views
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_prop);
            // set values into views
            letterView.setText("Beginner");  // using dummy data for now
            letterView.setText(mDetails[position]);
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }
}

