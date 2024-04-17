package schulung3;

import de.shd.java.course.util.ConsoleHelper;

public class MethodenAufgabe {

    public static void main(String[] args) {

        //Aufgabe 1
        /**
         * Lootbox3 ist eine Simulation für ein Lootbox System
         * bei welchem du Schlüssel kaufen musst und nachdem
         * mit diesen Boxen öffnen kannst
         */
        Lootbox3();



    }

    private static void Lootbox3() {
        // BASIC DECLARATION KEYS
        double keyPrice = 2.99;
        int numberOfKeys = ConsoleHelper.readInt("How many keys would you like to purchase?");
        double price = keyPrice * numberOfKeys;
        System.out.println("You bought " + numberOfKeys + " at a price of " + price + "€");

        // BONUS KEYS
        int bonusKeys;
        if (numberOfKeys > 50 && numberOfKeys < 101) {
            bonusKeys = 8;
        } else if (numberOfKeys > 100 && numberOfKeys < 201) {
            bonusKeys = 16;
        } else if (numberOfKeys > 200) {
            bonusKeys = 32;
        } else {
            bonusKeys = 0;
        }

        if (bonusKeys > 0) {
            System.out.println("You also got " + bonusKeys + " keys for free for your purchase!");
        }

        // LANGUAGE/LINGO
        String keyLingo;
        if (numberOfKeys == 1){
            keyLingo = "a key";
        }
        else {
            keyLingo = "keys";
        }

        // BASIC DECLARATION BOXES
        int numberOfLootboxes = ConsoleHelper.readInt("How many lootboxes would you like to open?");
        if (numberOfLootboxes == 0) {
            System.out.println("Why did u buy " + keyLingo + " then? >:(");
            System.exit(0);
        }


        // ACTUAL KEYS
        int actualKeys = numberOfKeys + bonusKeys;


        // OPENABLE BOXES
        int notOpenableBoxes = numberOfLootboxes - actualKeys;

        if (notOpenableBoxes < 0){
            notOpenableBoxes = 0;
        }

        int openableBoxes = numberOfLootboxes - notOpenableBoxes;


        // SPARE KEYS
        int spareKeys = actualKeys - openableBoxes;
        if (spareKeys < 0) {
            spareKeys = 0;
        }


        // LANGUAGE/LINGO
        String openLootboxLingo;
        if (openableBoxes == 1) {
            openLootboxLingo = "lootbox";
        }
        else {
            openLootboxLingo = "lootboxes";
        }

        String notOpenLootboxLingo;
        if (notOpenableBoxes == 1) {
            notOpenLootboxLingo = "lootbox";
        }
        else {
            notOpenLootboxLingo = "lootboxes";
        }

        String spareKeyLingo;
        if (actualKeys == 1) {
            spareKeyLingo = "key";
        }
        else {
            spareKeyLingo = "keys";
        }


        // FINAL OUTPUT
        if (numberOfLootboxes > actualKeys) {
            System.out.println("You opened " + openableBoxes + " " + openLootboxLingo + "." + "You don't have enough keys to open the remaining " + notOpenableBoxes + " " + notOpenLootboxLingo + ".");
        }
        else {
            System.out.println("You opened " + openableBoxes + " " + openLootboxLingo + " and have " + spareKeys + " " + spareKeyLingo + " left.");

        }
    }

}
