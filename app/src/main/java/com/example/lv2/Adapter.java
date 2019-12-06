package com.example.lv2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Adapter extends FragmentStatePagerAdapter{


    public Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public CharSequence getPageTitle(int position){
        int i = position+1;
        return "第"+ i+ "个";

    }



    @Override
    public Fragment getItem(int position) {
        if(0 == position){
            Fragment first = new ViewPagerFirst();
            return first;
        }
        if(1 == position){
            Fragment second = new ViewPagerSecond();
            return second;
        }
        if(2 == position){
            Fragment third = new ViewPagerThird();
            return third;
        }
        if(3 == position){
            Fragment fourth = new ViewPagerFourth();
            return fourth;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
