package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> cats = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        return cats;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> dogs = new HashSet<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> join = new HashSet<Object>();
        join.addAll(cats);
        join.addAll(dogs);
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        Iterator<Object> iterator = pets.iterator();
        for (Cat cat : cats)
            pets.remove(cat);
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object pets1: pets) {
            System.out.println(pets1);
        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
}
