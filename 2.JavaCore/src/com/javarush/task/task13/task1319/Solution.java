package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter((new FileOutputStream(reader.readLine()))));
        String str;
        do {
            str = reader.readLine();
            writer.write(str);

            if (!str.equals("exit")){
                writer.newLine();
            }
            else break;
        }
        while (!str.equals("exist"));
        writer.close();
        reader.close();
    }
}
