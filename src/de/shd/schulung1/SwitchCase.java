package de.shd.schulung1;

import de.shd.java.course.util.ConsoleHelper;

public class SwitchCase {

    public static void main(String[] args) {

        int userChoice = ConsoleHelper.readInt("Wähle ein Haustier: 1 = Hund, 2 = Katze, 3 = Waschbär, 4 = Wolf, 5 = Stinktier");

        switch (userChoice){
            case 1:
                System.out.println("Hier hast du einen Hund!");
                break;
            case 2:
                System.out.println("Hier hast du eine Katze!");
                break;
            case 3:
                System.out.println("Hier hast du einen Waschbären!");
                break;
            case 4:
                System.out.println("Hier hast du einen Wolf!");
                break;
            case 5:
                System.out.println("Hier hast du ein Stinktier!");
                break;
            default:
                System.out.println("Du hast kein korrektes Tier ausgewählt.");

        }
    }

}