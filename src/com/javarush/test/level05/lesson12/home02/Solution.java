package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Hleb", 26, "Kozhara 20-37");
        Man man2 = new Man("Kolya", 23, "Kirova 43-27");
        Woman woman1 = new Woman("Marina", 27, "Kozhara 20-37");
        Woman woman2 = new Woman("Sveta", 24, "Kozhara 13-32");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }
    public static class Man{
    String name;
    int age;
    String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(String name, int age, String address){
            return name+" "+age+" "+address;
        }
    }

    public static class Woman{
    String name;
    int age;
    String address;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(String name, int age, String address){
            return name+" "+age+" "+address;
        }
    }

}
