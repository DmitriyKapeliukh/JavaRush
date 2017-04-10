package com.javarush.task.task09.task0922;

import javafx.scene.input.DataFormat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date(reader.readLine());
        SimpleDateFormat newDate = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(newDate.format(date).toUpperCase());
    }
}
