package com.androidapps.junaid.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by junaid on 11/7/17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private String title;
    private Date mDate;

    private boolean mSolved;

    public Crime() {
    // Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
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

    public void setTitle(String title) {
        this.title = title;
    }
}
