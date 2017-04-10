package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>list = new ArrayList();
        for (int i = 0; i < 10; i++) list.add(Integer.parseInt(reader.readLine()));

        int maxSequence = 1;
        int tempSequence = 1;
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i) == list.get(i+1)) {
                tempSequence++;
                if (maxSequence < tempSequence) maxSequence = tempSequence;
            }
            else tempSequence = 1;

        }
        System.out.println(maxSequence);
    }
}