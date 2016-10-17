package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stringValue = br.readLine();
        int value = Integer.parseInt(stringValue);
        if(value >= 0){
            System.out.println(value * 2);
        }else
            System.out.println(value + 1);

    }

}