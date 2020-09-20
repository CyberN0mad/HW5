package com.company;


public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss(500, 111, " - Iron");


        System.out.println("Boss Health: " + boss.getBossHealth() + ". " + "Boss Damage: " + boss.getBossDamage() + ". "
                + " Boss Defence: " + boss.getDefence() + ".");

        Hero[] heroes = createdHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero Health: " +  heroes[i].getHealth());
            System.out.println("Hero Damage: " + heroes[i].getDamage());
            System.out.println("Hero Ultimate: " + heroes[i].getSuperAbility());

        }

    }

    public static Hero[] createdHeroes() {
        Hero Mortred = new Hero(100, 80, " - Coup de grace");
        Hero Creep = new Hero(50, 10);


        Hero Sven  = new Hero(200, 50, " - Overcharge");
        Hero Mirana = new Hero(100, 60, " - Star fall");
        Hero Balanar = new Hero(200, 60, " - Dark night");
        Hero[] heroes = {Mortred, Creep, Sven, Mirana, Balanar};
        return heroes;
    }

}
