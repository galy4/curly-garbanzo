package com.luxoft.files;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class TimeExample {

    public static void main(String[] args){

        Date date = new Date();
        System.out.println(date);
        String s = date.toString().replace(" OMST 2021", "");
        System.out.println(s);

        Date date1 = new Date(1212121212121L);
        System.out.println(date1);
        //comparing
        System.out.println(date.getTime() >= date1.getTime());
        //the same
        System.out.println(date.after(date1));
        System.out.println(date.before(date1));
        System.out.println(date.equals(date1));
        System.out.println("--------------------------");

        //format date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(formatter.format(date));

        //ISO 8601 - no timezone
        LocalDate date2 = LocalDate.parse("2018-05-05");
        System.out.println(date2);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("14-12-2021 18:51:22 Asia/Omsk", formatter1);
        System.out.println(zonedDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d-MMM-yyyy", Locale.US);
        String date3 = "16-Aug-2016";
        LocalDate localDate = LocalDate.parse(date3, formatter2);
        System.out.println(localDate); 
    }
}
