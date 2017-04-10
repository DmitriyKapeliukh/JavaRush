package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int sumEven = 0;
        int sumNotEven = 0;

        for (int i = 0; i < array.length; i++)
        array[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < array.length; i = i+2)
            sumEven += array[i];

        for (int i = 1; i < array.length; i = i+2)
            sumNotEven += array[i];

        if (sumEven > sumNotEven)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}
