package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
3Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();

        for (int i = 0; i < n; i++){
            list.add(reader.readLine());
        }
        for (int i = m - 1; i >= 0;i--){
            list1.add(list.get(i));
            list.remove(i);
        }
        for (int i = 0; i < list1.size(); i++){
            list.add(list1.get(list1.size() - 1 - i));
        }
        for (int j = 0; j < list.size(); j++)
            System.out.println(list.get(j));
    }
}
