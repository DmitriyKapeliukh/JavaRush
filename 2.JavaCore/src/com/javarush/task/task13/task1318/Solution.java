package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String source = reader.readLine();
        FileInputStream inputStream = new FileInputStream(source);

        String file = "";
        while (inputStream.available()>0){
            file += (char)inputStream.read();

            //System.out.print((char)inputStream.read());
        }
        System.out.print(file);

        reader.close();
        inputStream.close();


    }
}