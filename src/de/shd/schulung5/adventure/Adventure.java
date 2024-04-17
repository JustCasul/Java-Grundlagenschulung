package de.shd.schulung5.adventure;

import de.shd.java.course.util.ConsoleHelper;

import java.util.Random;

public class Adventure {

    public static void main(String[] args) {

        Random random = new Random();

        //Weapons
        Weapon keule = new Weapon("Keule", 30);
        Weapon longsword = new Weapon("Longsword", 40);
        Weapon claymore = new Weapon("Claymore", 50);
        Weapon morgenstern = new Weapon("Morgenstern", 25);
        Weapon dagger = new Weapon("Dagger", 20);

        //Adventurer
        Adventurer knight = new Adventurer("Wilhelm", 1500, longsword, "knight"); //strong against Eragon
        Adventurer highlander = new Adventurer("Kevin MccLeod", 1200, claymore, "highlander"); //strong against Drogtar
        Adventurer assassin = new Adventurer("Naafiri", 1000, dagger, "assassin"); //strong against Slither

        //Monster
        Monster dragon = new Monster("Eragon", 2000, 70, "dragon");
        Monster ogre = new Monster("Drogtar", 3000, 50, "ogre");
        Monster snake = new Monster("Slither", 1500, 80, "snake");

        String userInput = ConsoleHelper.readString("Choose your Adventurer :");

        int i = random.nextInt(3) + 1;
        Monster currentMonster;
        if (i == 1){
            currentMonster = dragon;
        } else if (i == 2) {
            currentMonster = ogre;
        } else {
            currentMonster = snake;
        }

        Adventurer currentAdventurer = null;
        switch (userInput) {
            case "knight" -> currentAdventurer = knight;
            case "highlander" -> currentAdventurer = highlander;
            case "assassin" -> currentAdventurer = assassin;
            default -> System.exit(0);
        }

        fight(currentAdventurer, currentMonster);

    }

    public static void fight(Adventurer currentAdventurer, Monster currentMonster){

        int currentWeaponDamage = currentAdventurer.getWeapon().getDamage();
        int adventurerCurrentHp = currentAdventurer.getGesundheit();
        int monsterCurrentHp = currentMonster.getGesundheit();

        if(currentMonster.getType().equals("dragon") && currentAdventurer.getType().equals("knight")){
            currentWeaponDamage = currentWeaponDamage * 3;
        }

        if(currentMonster.getType().equals("ogre") && currentAdventurer.getType().equals("highlander")){
            currentWeaponDamage = currentWeaponDamage * 5;
        }

        if(currentMonster.getType().equals("snake") && currentAdventurer.getType().equals("assassin")){
            currentWeaponDamage = currentWeaponDamage * 7;
        }

        System.out.println("The adventurer faces the " + currentMonster.getType() + ".");

        while(monsterCurrentHp > 0 && adventurerCurrentHp > 0){


            monsterCurrentHp = monsterCurrentHp - currentWeaponDamage;
            System.out.println("The adventurer strikes the Monster for " + currentWeaponDamage + " Damage and the Monster is now on " + monsterCurrentHp + " Hp.");


            if (monsterCurrentHp <= 0){
                System.out.println("The adventurer is victorious.");
                System.exit(0);
            }


            adventurerCurrentHp = adventurerCurrentHp - currentMonster.getDamage();
            System.out.println("The Monster attacks the adventurer and deals " + currentMonster.getDamage() + " Damage, the adventurer now has " + adventurerCurrentHp + " Hp left.");


            if (adventurerCurrentHp <= 0){
                System.out.println("The adventurer lost.");
                System.exit(0);
            }

        }

    }

}
