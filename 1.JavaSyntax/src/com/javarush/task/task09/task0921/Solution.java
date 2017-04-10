package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = -1; i < list.size(); i++) {
                int a = Integer.parseInt(reader.readLine());
                list.add(a);
            }
        } catch (IOException e) {
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }
}
