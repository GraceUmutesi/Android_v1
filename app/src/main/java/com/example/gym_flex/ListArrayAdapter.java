package com.example.gym_flex;

import android.content.Context;
import android.widget.ArrayAdapter;



public class ListArrayAdapter extends ArrayAdapter{
    private Context mContext;
    private String[] mSportNames;

    public ListArrayAdapter(Context mContext, int resource, String[] mSportNames) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mSportNames = mSportNames;

    }

    @Override
    public int getCount() {
        return mSportNames.length;
    }


    @Override
    public Object getItem(int position) {
        String sportNames = mSportNames[position];
        return String.format("%s",sportNames);
    }
}
