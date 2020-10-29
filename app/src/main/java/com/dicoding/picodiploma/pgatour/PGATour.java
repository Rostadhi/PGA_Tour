package com.dicoding.picodiploma.pgatour;

import android.os.Parcel;
import android.os.Parcelable;

public class PGATour implements Parcelable {
    private int playerimage;
    private String playername;
    private String location;
    private String country;
    private String year;
    private String majorwin;
    private String turnamenwin;

    protected PGATour(Parcel in) {
        playerimage = in.readInt();
        playername = in.readString();
        location = in.readString();
        country = in.readString();
        year = in.readString();
        majorwin = in.readString();
        turnamenwin = in.readString();
    }

    public static final Creator<PGATour> CREATOR = new Creator<PGATour>() {
        @Override
        public PGATour createFromParcel(Parcel in) {
            return new PGATour(in);
        }

        @Override
        public PGATour[] newArray(int size) {
            return new PGATour[size];
        }
    };

    public PGATour() {
    }

    public int getPlayerimage() {
        return playerimage;
    }

    public void setPlayerimage(int playerimage) {
        this.playerimage = playerimage;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMajorwin() {
        return majorwin;
    }

    public void setMajorwin(String majorwin) {
        this.majorwin = majorwin;
    }

    public String getTurnamenwin() {
        return turnamenwin;
    }

    public void setTurnamenwin(String turnamenwin) {
        this.turnamenwin = turnamenwin;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(playerimage);
        dest.writeString(playername);
        dest.writeString(location);
        dest.writeString(country);
        dest.writeString(year);
        dest.writeString(majorwin);
        dest.writeString(turnamenwin);
    }
}


