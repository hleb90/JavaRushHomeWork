package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a1 = br.readLine();
        int a = Integer.parseInt(a1);
        String b1 = br.readLine();
        int b = Integer.parseInt(b1);
        String c1 = br.readLine();
        int c = Integer.parseInt(c1);
        if((a == b) && (a != c)) System.out.println(a + " " + b);
        if((a == c) && (a != b))System.out.println(a + " " + c);
        if((b == c) && (a != c)) System.out.println(b + " " + c);
        if((a == b) &&  (a == c)) System.out.println(a + " " + b + " " + c);
    }

    }
