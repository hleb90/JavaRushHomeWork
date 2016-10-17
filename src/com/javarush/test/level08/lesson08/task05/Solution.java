package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Shilov", "Gleb");
        map.put("Shilo", "Kostya");
        map.put("Shilovf", "Marina");
        map.put("Shil", "Alex");
        map.put("Shov", "Alex");
        map.put("Hilov", "Grag");
        map.put("Shlv", "Idre");
        map.put("Tov", "Belg");
        map.put("Dilv", "Alex");
        map.put("Aov", "Idre");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            int n = 0;
            for (Map.Entry<String, String> p : copy.entrySet())
            {
                if (pair.getValue().equals(p.getValue()))
                    n++;
            }
            if (n >= 2)
                removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
