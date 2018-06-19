package com.project.kcci.habitsplanproject.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.project.kcci.habitsplanproject.fragment.MyHabitFragment;
import com.project.kcci.habitsplanproject.fragment.ShareHabitFragment;

public class MainViewPagerAdapter extends FragmentPagerAdapter{
    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new ShareHabitFragment();

        if (position == 1)
            return  new MyHabitFragment();

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if(position == 0)
            return "공유된 습관";
        if(position == 1)
            return "나의 습관";

        return super.getPageTitle(position);
    }
}
