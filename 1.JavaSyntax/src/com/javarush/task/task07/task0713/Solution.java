package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> main = new ArrayList<Integer>();
        ArrayList<Integer> notEven = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList <Integer> rest = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
            main.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < main.size(); i++) {
            int x = main.get(i);
            if (x % 2 == 0) even.add(x);
            if (x % 3 == 0) notEven.add(x);
            if (x % 2 != 0 && x % 3 != 0)rest.add(x);
        }

        printList(notEven);
        printList(even);
        printList(rest);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
    }
}
