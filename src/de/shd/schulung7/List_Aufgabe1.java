package de.shd.schulung7;

import java.util.ArrayList;
import java.util.List;

public class List_Aufgabe1 {

    public static void main(String[] args) {

        List<Item> listOfItems= new ArrayList<>();
        List<Item> listOfItems2= new ArrayList<>();

        Stopwatch stopwatch = new Stopwatch();

        //Aufgabe 1 a)
        stopwatch.start();
        while (listOfItems.size() < 1_000_000){
            listOfItems.add(new Item("Schwert", "Waffe", 7.35, 600));

        }
        stopwatch.stopAndPrint();
        listOfItems.clear();

        //Aufgabe 1 b)
        stopwatch.start();
        while (listOfItems2.size() < 1_000_000){
            listOfItems2.add(0, new Item("Schwert", "Waffe", 7.35, 600));

        }
        stopwatch.stopAndPrint();
        listOfItems2.clear();

    }

}
