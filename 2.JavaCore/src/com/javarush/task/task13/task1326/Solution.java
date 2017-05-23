package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Scanner readfile = new Scanner(new FileInputStream(reader.readLine()));
            List<Integer> list = new ArrayList<>();

            String num = "";

            while (readfile.hasNext()) {
                int number = readfile.nextInt();
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
            readfile.close();

            Collections.sort(list);
            for (int x : list) {
                System.out.println(x);
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
