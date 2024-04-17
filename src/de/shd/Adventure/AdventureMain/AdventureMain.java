package de.shd.Adventure.AdventureMain;

import de.shd.Adventure.Items.part.Armor;
import de.shd.Adventure.Items.part.Goldbag;
import de.shd.Adventure.Mobs.Adventurer;
import de.shd.Adventure.Items.Item;
import de.shd.Adventure.Mobs.Monster;
import de.shd.Adventure.Items.part.Weapon;
import de.shd.java.course.util.ConsoleHelper;

import java.util.*;

public class AdventureMain {

    public static void main(String[] args) {

        Random random = new Random();

        //Randomizer for ????? HP and DMG
        int sdfgvbzudfHealth = random.nextInt(6666);
        int sdfgvbzudfDamage = random.nextInt(999);

        //Weapons
        Weapon nullWeapon = new Weapon("No Weapon equipped","Weapon",0, 0);
        Weapon keule = new Weapon("Keule","Weapon", 30, 300);
        Weapon longsword = new Weapon("Longsword","Weapon",40, 450);
        Weapon claymore = new Weapon("Claymore","Weapon",50, 700);
        Weapon morgenstern = new Weapon("Morgenstern","Weapon",25, 300);
        Weapon dagger = new Weapon("Dagger","Weapon",20, 250);

        //Armor
        Armor nullHelmet = new Armor("No Helmet equipped", "Helmet", 0, 0);
        Armor nullChestplate = new Armor("No Chestplate equipped", "Chestplate", 0, 0);
        Armor nullPants = new Armor("No Pants equipped", "Pants", 0, 0);
        Armor nullShoes = new Armor("No Shoes equipped", "Shoes", 0, 0);
        Armor nullGloves = new Armor("No Gloves equipped", "Gloves", 0, 0);

        //Goldbag
        Goldbag goldbag = new Goldbag("goldbag","Item",0, 5);

        //Adventurer
        Adventurer knight = new Adventurer("Wilhelm", 1500, longsword, "knight"); //strong against Eragon
        Adventurer highlander = new Adventurer("Kevin MccLeod", 1200, claymore, "highlander"); //strong against Drogtar
        Adventurer assassin = new Adventurer("Talon", 1000, dagger, "assassin"); //strong against Slither

        //Monster
        Monster dragon = new Monster("Eragon", 2000, 70, "dragon");
        Monster ogre = new Monster("Drogtar", 3000, 50, "ogre");
        Monster snake = new Monster("Slither", 1500, 80, "snake");
        Monster sdfgvbzudf = new Monster("?????", sdfgvbzudfHealth,sdfgvbzudfDamage,"????");

        String userInput = ConsoleHelper.readString("Choose your Adventurer :");

        //ArrayList für Inventar
        List<Item> inventory = new ArrayList<>();
        inventory.add(goldbag);

        Item item = inventory.get(0);

        //Wenn item eine Waffe ist mache ... (getName)
        if (item instanceof Weapon weapon){
            weapon.getName();
        }

        //HashMap für aktuelle Ausrüstung
        Map<String, Item> typeToItemMap = new HashMap<>();
        typeToItemMap.put("Weapon", nullWeapon);
        typeToItemMap.put("Helmet", nullHelmet);
        typeToItemMap.put("Chestplate", nullChestplate);
        typeToItemMap.put("Pants", nullPants);
        typeToItemMap.put("Shoes", nullShoes);
        typeToItemMap.put("Gloves", nullGloves);

        //Random Monster
        int i = random.nextInt(4) + 1;
        Monster currentMonster;
        if (i == 1){
            currentMonster = dragon;
        } else if (i == 2) {
            currentMonster = ogre;
        } else if (i == 3){
            currentMonster = snake;
        } else {
            currentMonster = sdfgvbzudf;
        }

        //Adventurer choice
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

        //Adventurer Buffs
        if(currentMonster.getType().equals("dragon") && currentAdventurer.getType().equals("knight")){
            currentAdventurer.getWeapon().setDamage(currentAdventurer.getWeapon().getDamage() * 3);
        }

        if(currentMonster.getType().equals("ogre") && currentAdventurer.getType().equals("highlander")){
            currentAdventurer.getWeapon().setDamage(currentAdventurer.getWeapon().getDamage() * 5);
        }

        if(currentMonster.getType().equals("snake") && currentAdventurer.getType().equals("assassin")){
            currentAdventurer.getWeapon().setDamage(currentAdventurer.getWeapon().getDamage() * 7);
        }

        //Fight
        while(currentMonster.getGesundheit() > 0 && currentAdventurer.getGesundheit() > 0){

            if (currentMonster.getType().equals("????")) {
                System.out.println("You face the " + currentMonster.getName() + " your 'Eyes of the Adventurer' cannot detect its Health and Damage, what is going on?");
            } else {
                System.out.println("You face the " + currentMonster.getName() + " your 'Eyes of the Adventurer' detect that he has " + currentMonster.getGesundheit() + " Health and deals " + currentMonster.getDamage() + " Damage, i hope you came prepared.");
            }

            currentMonster.setGesundheit(currentMonster.getGesundheit() - currentAdventurer.getWeapon().getDamage());
            System.out.println("The adventurer strikes the Monster for " + currentAdventurer.getWeapon().getDamage() + " Damage and the Monster is now on " + currentMonster.getGesundheit() + " Hp.");


            if (currentMonster.getGesundheit() <= 0){
                System.out.println("The adventurer is victorious.");
                System.exit(0);
            }


            currentAdventurer.setGesundheit(currentAdventurer.getGesundheit() - currentMonster.getDamage());
            System.out.println("The Monster attacks the adventurer and deals " + currentMonster.getDamage() + " Damage, the adventurer now has " + currentAdventurer.getGesundheit() + " Hp left.");


            if (currentAdventurer.getGesundheit() <= 0){
                System.out.println("The adventurer lost.");
                System.exit(0);
            }

        }


    }

}
