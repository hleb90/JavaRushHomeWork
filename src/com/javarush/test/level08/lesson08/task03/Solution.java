package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Глеб");
        map.put("2", "Марина");
        map.put("3", "Филлип");
        map.put("4", "Костя");
        map.put("5", "Шейка");
        map.put("6", "Глеб");
        map.put("7", "Александр");
        map.put("8", "Иосиф");
        map.put("9", "Змей");
        map.put("10", "Змей");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int na = 0;
        for (Map.Entry<String,String> n : map.entrySet())
            if (n.getValue().equals(name))
                na++;
        return na;
    }/*







    */

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int la = 0;
        for (Map.Entry<String,String> n : map.entrySet())
            if (n.getKey().equals(lastName))
                la++;
        return la;
    }
}
