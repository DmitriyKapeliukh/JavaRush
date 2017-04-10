package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("asd1", "zxc1");
        map.put("asd2", "zxc1");
        map.put("asd3", "zxc1");
        map.put("asd4", "zxc4");
        map.put("asd5", "zxc5");
        map.put("asd6", "zxc6");
        map.put("asd7", "zxc6");
        map.put("asd8", "zxc8");
        map.put("asd9", "zxc9");
        map.put("asd0", "zxc0");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countLastName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if (value.equals(name)) countLastName++;
        }

        return countLastName;

    }


    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        int countFirstName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            if (key.equals(lastName)) countFirstName++;
        }

        return countFirstName;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();

            getCountTheSameFirstName(map, "asd6");
            getCountTheSameLastName(map, "zxc1");

    }
}
