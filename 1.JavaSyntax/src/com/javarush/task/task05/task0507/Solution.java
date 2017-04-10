package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int buffer = 0;
        int count = 0;
       while (true){
           int i = Integer.parseInt(reader.readLine());
           if (i == -1){
               break;
           }
            buffer += i;
           count++;
       }

        System.out.println((double) buffer/count);
    }
}

