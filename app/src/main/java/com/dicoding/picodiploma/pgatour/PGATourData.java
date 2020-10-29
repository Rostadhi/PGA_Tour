package com.dicoding.picodiploma.pgatour;

import java.util.ArrayList;

public class PGATourData {
    private static final String[] playername = {
            "Bryson Dechambeu",
            "Rory Mclroy",
            "Cameron Champ",
            "Bubba Watson",
            "Sergio Garcia",
            "Gary Woodland",
            "John Rahm",
            "Adam Scott",
            "Tony Finau",
            "Tiger Woods"
    };
    private static final String[] location = {
            "California",
            "Jupiter",
            "Omaha",
            "New York",
            "Barcelona",
            "Texas",
            "Lisbon",
            "Melbourne",
            "Oklahoma",
            "Jupiterisland"
    };
    private static final String[] country = {
            "USA",
            "Ireland",
            "USA",
            "USA",
            "Spanyol",
            "USA",
            "Portugal",
            "Australia",
            "USA",
            "USA"
    };
    private static final String[] year = {
            "2014",
            "2008",
            "2017",
            "2000",
            "1995",
            "1999",
            "2017",
            "2001",
            "2015",
            "1996"
    };
    private static final String[] majorwin = {
            "0",
            "5",
            "0",
            "2",
            "1",
            "0",
            "1",
            "1",
            "0",
            "15"
    };
    private static final String[] turnamenwin = {
            "5",
            "23",
            "3",
            "9",
            "14",
            "1",
            "9",
            "5",
            "1",
            "83"
    };
    private static final int[] playerimage = {
           R.drawable.images1,
            R.drawable.images2,
            R.drawable.images3,
            R.drawable.images4,
            R.drawable.images5,
            R.drawable.images6,
            R.drawable.images7,
            R.drawable.images8,
            R.drawable.images9,
            R.drawable.images10
    };
    static ArrayList<PGATour> getListData(){
        ArrayList<PGATour> list = new ArrayList<>();
        for (int position = 0; position < playername.length; position++) {
            PGATour pgaTour = new PGATour();
            pgaTour.setPlayername(playername[position]);
            pgaTour.setLocation(location[position]);
            pgaTour.setCountry(country[position]);
            pgaTour.setYear(year[position]);
            pgaTour.setMajorwin(majorwin[position]);
            pgaTour.setTurnamenwin(turnamenwin[position]);
            pgaTour.setPlayerimage(playerimage[position]);
            list.add(pgaTour);
        }
        return list;
    }
}
