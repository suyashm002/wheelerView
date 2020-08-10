package com.suyash.wheelerview;

import android.os.Parcel;
import android.os.Parcelable;

public class pojo implements Parcelable {

    String textHeader;
    String tectDescription;

    protected pojo(Parcel in) {
        textHeader = in.readString();
        tectDescription = in.readString();
    }

    public static final Creator<pojo> CREATOR = new Creator<pojo>() {
        @Override
        public pojo createFromParcel(Parcel in) {
            return new pojo(in);
        }

        @Override
        public pojo[] newArray(int size) {
            return new pojo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(textHeader);
        dest.writeString(tectDescription);
    }
}
