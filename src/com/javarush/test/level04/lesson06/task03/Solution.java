package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);

        if (a > b && b > c)

            System.out.println(a + " " + b + " " + c);

        if (a > c && c > b)

            System.out.println(a + " " + c + " " + b);

        if (c > a && a > b)

            System.out.println(c + " " + a + " " + b);

        if (c > b && b > a)

            System.out.println(c + " " + b + " " + a);

        if (b > a && a > c)

            System.out.println(b + " " + a + " " + c);

        if (b > c && c > a)

            System.out.println(b + " " + c + " " + a);

    }

}
        /*System.out.println(max(a, b, c));
        System.out.println(mid(a, b, c));
        System.out.println(min(a, b, c));*/



    /*
    public static int max(int a, int b, int c) {
        if ((a < b) && (a < c))
            return a;
        else if ((b < a) && (b < c))
            return b;
        else
            return c;
    }

    public static int mid(int a, int b, int c) {
        if ((a > c) && (a < c))
            return a;
        else if ((b > a) && (b < c))
            return b;
        else
            return c;
    }

    public static int min(int a, int b, int c) {
        if ((a > b) && (a > c))
            return a;
        else if ((b > c) && (b > a))
            return b;
        else
            return c;
    }*/







