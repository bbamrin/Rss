package com.example.nick.rss.data;

import android.provider.BaseColumns;

public  final class NewsContractClass {

    private NewsContractClass(){}

    public static class NewsDB implements BaseColumns{
        public static String NAME = "NewsDB";
        public static String NEWS_COLUMN = "news";
        public static String HEADERS_COLUMN = "headers";
    }

    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE " +
            " (" + NewsDB.NAME + ")" + " INTEGER PRIMARY KEY," +
            NewsDB.HEADERS_COLUMN + " TEXT," + NewsDB.NEWS_COLUMN + " TEXT)";

    private static final String SQL_DELETE_ENTRIES = "DROP IF EXISTS" + NewsDB.NAME;


    public static String giveDeleteOrder(){
        return SQL_DELETE_ENTRIES;
    }


    public static String giveCreateOrder(){
        return SQL_CREATE_ENTRIES;
    }
}
