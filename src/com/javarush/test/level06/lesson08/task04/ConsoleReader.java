package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return s;

    }

    public static int readInt() throws Exception
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        return a;

    }

    public static double readDouble() throws Exception
    {
        Scanner scn1 = new Scanner(System.in);
        double b = scn1.nextDouble();
        return b;

    }

    public static boolean readBoolean() throws Exception
    {
        Scanner scn2 = new Scanner(System.in);
        boolean c = scn2.nextBoolean();
        return c;

    }
}
