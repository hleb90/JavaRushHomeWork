package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> clearList = new ArrayList<Human>();
        ArrayList<Human> child = new ArrayList<Human>();
        Human child1 = new Human("Scott", true, 14, clearList);
        Human child2 = new Human("Prince", true, 12, clearList);
        Human child3 = new Human("Helen", false, 10, clearList);
        child.add(child1);
        child.add(child2);
        child.add(child3);
        ArrayList<Human> fathersList = new ArrayList<Human>();
        Human father = new Human("John", true, 40, child);
        fathersList.add(father);
        ArrayList<Human> mothersList = new ArrayList<Human>();
        Human mother = new Human("Teraza", false, 40, child);
        mothersList.add(mother);
        Human grandfather1 = new Human("Travis", true, 68, fathersList);
        Human grandmother1 = new Human("Eysedora", true, 67, fathersList);
        Human grandfather2 = new Human("Derek", true, 68, mothersList);
        Human grandmother2 = new Human("Eva", true, 67, mothersList);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
