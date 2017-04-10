package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("Вова", true, 55);
        Human grandpa2 = new Human("Олег", true, 65);
        Human grandma1 = new Human("Анна", false, 51);
        Human grandma2 = new Human("Ольга", false, 58);
        Human father = new Human("Андрей", true, 40, grandpa1, grandma1);
        Human mother = new Human("Вика", false, 45, grandpa2, grandma2);
        Human child1 = new Human("Антон", true, 15, father, mother);
        Human child2 = new Human("Миша", true, 19, father, mother);
        Human child3 = new Human("Таня", false, 18, father, mother);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















