package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int i = 0;
        if(a > 0)
            i = i + 1;
        else
            i = i;
        if(b > 0)
            i = i + 1;
        else
            i = i;
        if(c > 0) {
            i = i + 1;
            System.out.println(i);
        }
        else {
            i = i;
            System.out.println(i);
        }
    }
}
