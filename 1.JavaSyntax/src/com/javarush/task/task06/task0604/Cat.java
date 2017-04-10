package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

import java.util.Calendar;

public class Cat {
    public static int catCount = 0;

    public Cat(){
        catCount++;
    }
    protected void finalize() throws Throwable{
        catCount--;
    }

    public static void main(String[] args) {

    }
}