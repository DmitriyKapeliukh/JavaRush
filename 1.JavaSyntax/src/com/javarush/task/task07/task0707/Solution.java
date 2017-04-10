package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        String s = "list";
        String d = "trap";
        String f = "stop";
        String g = "balk";
        String h = "mall";

        list.add(s);
        list.add(d);
        list.add(f);
        list.add(g);
        list.add(h);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
