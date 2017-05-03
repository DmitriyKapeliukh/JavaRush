package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Run{
        void go();
    }

    public interface Swim{
        void jump();
    }

    public abstract class Human implements Run, Swim{

    }
}
