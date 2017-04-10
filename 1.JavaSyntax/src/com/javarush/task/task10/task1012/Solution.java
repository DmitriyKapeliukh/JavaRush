package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (int i = 0; i < alphabet.size(); i++){
            int count = 0;
            for (int k = 0; k < list.size(); k++){
                char[] equals = list.get(k).toCharArray();
                for (int j = 0; j < equals.length; j++){
                    if (alphabet.get(i) == equals[j]){
                        count++;
                    }
                }
            }
            System.out.println(alphabet.get(i)+" "+count);
        }

//        Map<Character, Integer[]> charCounter = new HashMap<>();
//        for (Character character : abcArray) {
//            charCounter.put(character, new Integer[]{0});
//        }
//        for (String targetLine : list) {
//            for (Character targetChar : targetLine.toCharArray()) {
//                charCounter.get(targetChar)[0]++;
//            }
//        }
//        for (Character charToPrint: alphabet) {
//            System.out.println(charToPrint + " " + charCounter.get(charToPrint)[0]);
//        }


    }
}
