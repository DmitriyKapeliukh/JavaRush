package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        Set<String> duplicates = new HashSet<>();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String curValue = pair.getValue();
            int num = 0;

            for (Map.Entry<String, String> pair1 : map.entrySet()) {
                if (pair1.getValue().equals(curValue)) num++;
            }

            if (num > 1) duplicates.add(curValue);
        }

        for (String d: duplicates) {
            removeItemFromMapByValue(map, d);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        Set<String> keysToDelete = new HashSet<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(value)) keysToDelete.add(pair.getKey());
        }
        for (String key : keysToDelete) {
            map.remove(key);
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

    }
}
