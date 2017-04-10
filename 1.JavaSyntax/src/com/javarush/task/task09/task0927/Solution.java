package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<String, Cat>();
        cats.put("ASD1", new Cat("ASD0"));
        cats.put("ASD2", new Cat("ASD9"));
        cats.put("ASD3", new Cat("ASD8"));
        cats.put("ASD4", new Cat("ASD7"));
        cats.put("ASD5", new Cat("ASD6"));
        cats.put("ASD6", new Cat("ASD5"));
        cats.put("ASD7", new Cat("ASD4"));
        cats.put("ASD8", new Cat("ASD3"));
        cats.put("ASD9", new Cat("ASD2"));
        cats.put("ASD0", new Cat("ASD1"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> newVariable = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            newVariable.add(pair.getValue());
        }
        return newVariable;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
