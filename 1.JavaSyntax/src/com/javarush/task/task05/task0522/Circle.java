package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Circle(double y){
        this.y = y;
    }
    public Circle(double radius, double x, double y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    public Circle(){

    }

    public static void main(String[] args) {

    }
}