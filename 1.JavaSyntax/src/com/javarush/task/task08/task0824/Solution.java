package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human maloy1 = new Human("Jake", true, 14, new ArrayList<Human>());
        Human maloy2 = new Human("Andrew", true, 12, new ArrayList<Human>());
        Human maloy3 = new Human("Alison", false, 11, new ArrayList<Human>());
        ArrayList<Human> child = new ArrayList<>();
        child.add(maloy1);
        child.add(maloy2);
        child.add(maloy3);

        Human father = new Human("Tom", true, 40, child);
        Human mather = new Human("Alise", false, 38, child);
        ArrayList<Human> parents = new ArrayList<Human>();
        ArrayList<Human> parents1 = new ArrayList<Human>();
        parents.add(father);
        parents1.add(mather);

        Human grandfather = new Human("Bob", true, 66, parents);
        Human grandfather1 = new Human("Pol", true, 65, parents1);
        Human grandmoher = new Human("Kate", false, 64, parents);
        Human grandmoher1 = new Human("Nina", false, 61, parents1);

        System.out.println(grandfather.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandmoher.toString());
        System.out.println(grandmoher1.toString());
        System.out.println(father.toString());
        System.out.println(mather.toString());
        System.out.println(maloy1.toString());
        System.out.println(maloy2.toString());
        System.out.println(maloy3.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
