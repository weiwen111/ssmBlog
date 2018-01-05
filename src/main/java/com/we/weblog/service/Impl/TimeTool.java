package com.we.weblog.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeTool {

    private static final Calendar CALENDAR =  Calendar.getInstance();



    public  static  int  getYear(Date  date)  {
        CALENDAR.setTime(date);
        return  CALENDAR.get(Calendar.YEAR);
    }

    public static String getEdate(Date date){
        SimpleDateFormat df = new SimpleDateFormat("MMM dd", Locale.UK);
        df.setTimeZone(new java.util.SimpleTimeZone(0, "GMT"));
        return df.format(date);
    }
}