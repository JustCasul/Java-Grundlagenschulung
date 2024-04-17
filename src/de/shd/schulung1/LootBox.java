package de.shd.schulung1;

import de.shd.java.course.util.ConsoleHelper;

public class LootBox {

    public static void main(String[] args) {

        //Declaration and Initialisation
        double keyPrice = 2.99;
        int numberOfKeys = ConsoleHelper.readInt("How many keys would you like to purchase?");
        double price = keyPrice * numberOfKeys;
        System.out.println("You bought " + numberOfKeys + " at a price of " + price + "€");
        int numberOfLootboxes = ConsoleHelper.readInt("How many Lootboxes would you like to open?");
        if (numberOfLootboxes == 0) {
            System.out.println("Why did u buy a key then? >:(");
            System.exit(0);
        }

        int bonusKeys = 0;

        if (numberOfKeys > 50 && numberOfKeys < 101) {
            bonusKeys = 8;
        }
        else if (numberOfKeys > 100 && numberOfKeys < 201) {
            bonusKeys = 16;
        }
        else if (numberOfKeys > 200) {
            bonusKeys = 32;
        }
        else {
            bonusKeys = 0;
        }

        int spareKeys = numberOfKeys - numberOfLootboxes;
        if (spareKeys < 0) {
            spareKeys = 0;
        }

        int actualKeys = numberOfKeys + bonusKeys;

        int notAffordableLootboxes = numberOfLootboxes - actualKeys;
        if (notAffordableLootboxes < 0) {
            notAffordableLootboxes = 0;
        }

        int affordableLootboxes = numberOfLootboxes - notAffordableLootboxes;
        int openableBoxes = affordableLootboxes + bonusKeys;

        int openedBoxes = numberOfLootboxes - notAffordableLootboxes;

        String lootboxLingo;
        if (openableBoxes == 1) {
            lootboxLingo = "lootbox";
        }
        else {
            lootboxLingo = "lootboxes";
        }

        String keyLingo;
        if (actualKeys == 1) {
            keyLingo = "key";
        }
        else {
            keyLingo = "keys";
        }




        if (numberOfLootboxes > numberOfKeys) {
            System.out.println("You opened " + openedBoxes + " " + lootboxLingo +" and have " +  spareKeys + " " + keyLingo + " left.");
        }
        else if (numberOfLootboxes < numberOfKeys){
            System.out.println("You opened " + openedBoxes + " " + lootboxLingo +" and have " +  spareKeys + " " + keyLingo + " left.");
        }
        else {
            System.out.println("You opened " + openedBoxes + " " + lootboxLingo +" and have " +  spareKeys + " " + keyLingo + " left.");
        }

        System.out.println("Thank you for your Purchase ;)");
    }

}
