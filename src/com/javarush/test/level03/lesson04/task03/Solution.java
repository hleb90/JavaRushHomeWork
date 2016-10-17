package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg = new Zerg();
        zerg.name = "nick";
        Zerg zerg1 = new Zerg();
        zerg1.name = "jack";
        Zerg zerg2 = new Zerg();
        zerg2.name = "sydney";
        Zerg zerg3 = new Zerg();
        zerg3.name = "golf";
        Zerg zerg4 = new Zerg();
        zerg4.name = "jeff";
        Zerg zerg5 = new Zerg();
        zerg5.name = "rocky";
        Zerg zerg6 = new Zerg();
        zerg6.name = "mit";
        Zerg zerg7 = new Zerg();
        zerg7.name = "dick";
        Zerg zerg8 = new Zerg();
        zerg8.name = "shee";
        Zerg zerg9 = new Zerg();
        zerg9.name = "carey";
        Protos protos =  new Protos();
        protos.name = "zolfy";
        Protos protos1 =  new Protos();
        protos1.name = "zolf";
        Protos protos2 =  new Protos();
        protos2.name = "zol";
        Protos protos3 =  new Protos();
        protos3.name = "zo";
        Protos protos4 =  new Protos();
        protos4.name = "z";
        Terran terran = new Terran();
        terran.name = "terranofobly";
        Terran terran1 = new Terran();
        terran1.name = "terranofobl";
        Terran terran2 = new Terran();
        terran2.name = "terranofob";
        Terran terran3 = new Terran();
        terran3.name = "terranofo";
        Terran terran4 = new Terran();
        terran4.name = "terranof";
        Terran terran5 = new Terran();
        terran5.name = "terrano";
        Terran terran6 = new Terran();
        terran6.name = "terran7";
        Terran terran7 = new Terran();
        terran7.name = "terra";
        Terran terran8 = new Terran();
        terran8.name = "terr";
        Terran terran9 = new Terran();
        terran9.name = "ter";
        Terran terran10 = new Terran();
        terran10.name = "te";
        Terran terran11 = new Terran();
        terran11.name = "t";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}