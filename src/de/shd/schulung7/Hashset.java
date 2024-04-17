package de.shd.schulung7;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

    public static void main(String[] args) {

        Item dagger = new Item("Klinge von Drakthaar", "Waffe", 0, 0);
        Item dagger1 = new Item("Klinge von Drakthaar1", "Waffe", 1, 1000);
        Item dagger2 = new Item("Klinge von Drakthaar2", "Waffe", 2, 2000);
        Item dagger3 = new Item("Klinge von Drakthaar3", "Waffe", 3, 3000);
        Item dagger4 = new Item("Klinge von Drakthaar4", "Waffe", 4, 4000);
        Item dagger5 = new Item("Klinge von Drakthaar5", "Waffe", 5, 5000);
        Item dagger6 = new Item("Klinge von Drakthaar6", "Waffe", 6, 6000);
        Item dagger7 = new Item("Klinge von Drakthaar7", "Waffe", 7, 7000);
        Item dagger8 = new Item("Klinge von Drakthaar8", "Waffe", 8, 8000);
        Item dagger9 = new Item("Klinge von Drakthaar9", "Helm", 9, 9000);


        Set<Item> numbers = new HashSet<>();
        numbers.add(dagger);
        numbers.add(dagger1);
        numbers.add(dagger2);
        numbers.add(dagger3);
        numbers.add(dagger4);
        numbers.add(dagger5);
        numbers.add(dagger6);
        numbers.add(dagger7);
        numbers.add(dagger8);
        numbers.add(dagger9);

        for (Item item : numbers) {
            System.out.println(item.getName());
        }

    }

}
