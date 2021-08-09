package com.example.timetracker;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    List<String> appList;

    public PagerAdapter(FragmentManager fm, int NumOfTabs, List<String> applist) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.appList = applist;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        StatsFragment statsFragment = new StatsFragment();
        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("period", position);
        statsFragment.setArguments(args);
        return statsFragment;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}

