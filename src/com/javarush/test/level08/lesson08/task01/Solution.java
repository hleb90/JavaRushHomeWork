package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet() {
        Set<String> set = new HashSet<String>();
        set.add("Лак");
        set.add("Люк");
        set.add("Лор");
        set.add("Лара");
        set.add("Лист");
        set.add("Лама");
        set.add("Люфт");
        set.add("Люки");
        set.add("Лооо");
        set.add("Лавиаи");
        set.add("Лекет");
        set.add("Лфысыс");
        set.add("Лйцуакц");
        set.add("Лленл");
        set.add("Липпп");
        set.add("Лпкии");
        set.add("Лкиуиуи");
        set.add("Льньнь");
        set.add("Ленгьень");
        set.add("Лаццие");

        return (HashSet<String>)set;
    }
}
