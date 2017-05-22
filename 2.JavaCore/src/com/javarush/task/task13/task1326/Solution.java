package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader readfile = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));


            List<Integer> list = new ArrayList<>();

            String num = "";

            while ((num = readfile.readLine()) != null) {
                int number = Integer.parseInt(num);
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
            readfile.close();
            reader.close();

            Collections.sort(list);
            for (int x : list) {
                System.out.println(x);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
