package com.example.samsulkarim.myviewpager;

import android.support.v7.widget.CardView;

/**
 * Created by shamsul on 2/14/18.
 */

public interface CardAdapter {

    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
