package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private static String name;
        private static int age;
        private static boolean sex;
        private static String heir;
        private static int height;
        private static int weight;

        public Human (String name){
            this.name = name;
        }

        public Human (String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human (String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human (String name, int age, boolean sex, String heir){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.heir = heir;
        }

        public Human (String name, int age, boolean sex, String heir, int height){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.heir = heir;
            this.height = height;
        }

        public Human (String name, int age, boolean sex, String heir, int height, int weight){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.heir = heir;
            this.height = height;
            this.weight = weight;
        }

        public Human (int age, boolean sex){
            this.age = age;
            this.sex = sex;
        }

        public Human (int age, boolean sex, String heir){
            this.age = age;
            this.sex = sex;
            this.heir = heir;
        }

        public Human (boolean sex, String heir, int height){
            this.sex = sex;
            this.heir = heir;
            this.height = height;
        }

        public Human (String heir, int height, int weight){
            this.heir = heir;
            this.height = height;
            this.weight = weight;
        }

    }

}
