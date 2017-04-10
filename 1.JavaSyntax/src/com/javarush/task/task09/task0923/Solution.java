package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList vowels = new ArrayList<>();
        ArrayList notVowels = new ArrayList();
        ArrayList space = new ArrayList();
        String s = reader.readLine();
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++){
            char verify = charArray[i];
            if (isVowel(verify)){
                vowels.add(verify);
                //vowels.add(" ");
            }
            else if (verify == ' '){
                space.add(verify);
            }
            else {
                notVowels.add(verify);
                //vowels.add(" ");
            }
        }
        for (int i = 0; i < vowels.size(); i++) {
            System.out.print(vowels.get(i));
            System.out.print(" ");
        }

        System.out.println();
        for (int i = 0; i < notVowels.size(); i++){
            System.out.print(notVowels.get(i));
            System.out.print(" ");
        }


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}