package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) list[i] = (Integer.parseInt(reader.readLine()));
        maximum = list[0];
        minimum = list[0];
        for (int i = 0; i < list.length; i++){
            if (maximum < list[i]) maximum = list[i];
            if (minimum > list[i]) minimum = list[i];
        }

        System.out.println(maximum+" "+minimum);
    }
}
