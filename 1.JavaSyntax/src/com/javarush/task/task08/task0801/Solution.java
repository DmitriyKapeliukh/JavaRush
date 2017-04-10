package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> collection = new HashSet<>();
        collection.add("арбуз");
        collection.add("банан");
        collection.add("вишня");
        collection.add("груша");
        collection.add("дыня");
        collection.add("ежевика");
        collection.add("жень-шень");
        collection.add("земляника");
        collection.add("ирис");
        collection.add("картофель");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
