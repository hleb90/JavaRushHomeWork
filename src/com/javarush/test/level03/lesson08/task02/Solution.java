package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String sNumber1 = br.readLine();
        int number1 = Integer.parseInt(sNumber1);
        String sNumber2 = br.readLine();
        int number2 = Integer.parseInt(sNumber2);
        System.out.println((name) + " получает " + (number1) + " через " + (number2) + " лет ");
    }
}