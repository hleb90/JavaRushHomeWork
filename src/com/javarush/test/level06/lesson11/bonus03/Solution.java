package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final ArrayList< Integer > list = new ArrayList<>(); //массив
        for (int i = 0; i < 5; i++){ //внесение объектов..
            list.add(Integer.parseInt(reader.readLine())); //..в числах
        }
        Collections.sort(list); //сортировка
        for (Object obj : list){  //прохождение по массиву..
            System.out.println(obj); // ..и вывод по порядку
        }



    }
}
