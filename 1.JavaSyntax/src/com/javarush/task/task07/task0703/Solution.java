package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arrayString = new String [10];
        int[] arrayInt = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            arrayString[i] = reader.readLine();

        for (int i = 0; i < arrayString.length; i++) {
            arrayInt[i] = arrayString[i].length();
            System.out.println(arrayInt[i]);
        }
    }
}
