package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sValue1 = br.readLine();
        int value1 = Integer.parseInt(sValue1);
        String sValue2 = br.readLine();
        int value2 = Integer.parseInt(sValue2);
        if (value1 > value2) {
            System.out.println(value2);
        }
        else
            System.out.println(value1);
    }
}