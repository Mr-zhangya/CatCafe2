package com.demo.utils;

import java.text.DecimalFormat;

public class StringUtils {

    public static String getStrTime(int time){
        // 7146   02:00:00
        StringBuilder sb =new StringBuilder();
        int hour = time / 3600; // 1
        DecimalFormat df = new DecimalFormat("00");
        sb.append(df.format(hour)+":");// 01:
        int temp = time % 3600; // 3546
        int minute = temp / 60 ;// 59

        sb.append(df.format(minute)+":");
        int second = temp % 60; //
        sb.append(df.format(second));

        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(getStrTime(7260));
    }
}
