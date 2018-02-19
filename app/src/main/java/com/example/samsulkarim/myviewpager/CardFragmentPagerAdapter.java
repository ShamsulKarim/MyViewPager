package com.example.samsulkarim.myviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shamsul on 2/14/18.
 */

public class CardFragmentPagerAdapter extends FragmentStatePagerAdapter implements CardAdapter  {

    private List<Fragment> mFragments;
    private float mBaseElevation;
    private boolean adRemoved = false;

    public CardFragmentPagerAdapter(FragmentManager fm, float baseElevation) {
        super(fm);
        mFragments = new ArrayList<>();
        mBaseElevation = baseElevation;



            if(!adRemoved){

                    addCardFragment(new CardFramgmentBuy());
                    addCardFragment(new CardFragment());

            }else {

                addCardFragment(new CardFramgmentBuy());
            }


    }

    @Override
    public float getBaseElevation() {
        return mBaseElevation;
    }

    @Override
    public CardView getCardViewAt(int position) {

        if( position == 0){

            CardFramgmentBuy buy = (CardFramgmentBuy)mFragments.get(position);
            return  buy.getCardView();
        }else {
            CardFragment cardFragment= (CardFragment) mFragments.get(position);
            return cardFragment.getCardView();
        }

    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Object fragment = super.instantiateItem(container, position);
        if( position == 0){
            mFragments.set(position, (CardFramgmentBuy) fragment);
            return fragment;
        }else {
            mFragments.set(position, (CardFragment) fragment);
            return fragment;
        }

    }

    public void addCardFragment(Fragment fragment) {
        mFragments.add(fragment);
    }
}
