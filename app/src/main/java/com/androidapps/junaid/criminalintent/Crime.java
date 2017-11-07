package com.androidapps.junaid.criminalintent;

/**
 * Created by junaid on 11/7/17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;


    public Crime() {
    // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmTitle() {

        return mTitle;
    }

    public UUID getmId() {

        return mId;
    }
}
