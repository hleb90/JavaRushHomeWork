package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Arni", new Date("JULY 4 1990"));
        map.put("El", new Date("DECEMBER 17 1985"));
        map.put("Miki", new Date("JANUARY 1 1981"));
        map.put("Niki", new Date("MAY 18 1988"));
        map.put("Tom", new Date("SEPTEMBER 11 1984"));
        map.put("Toni", new Date("AUGUST 1 1983"));
        map.put("Tobi", new Date("OCTOBER 1 1987"));
        map.put("Karl", new Date("JUNE 1 1975"));
        map.put("Lui", new Date("JULY 1 1960"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Date date = iterator.next().getValue();
            int month = date.getMonth();
            if(month > 4 && month < 8)
                iterator.remove();
        }
    }
}
