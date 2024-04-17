package de.shd.schulung7;

import java.util.LinkedList;

public class List_Aufgabe2 {

    public static void main(String[] args) {

        LinkedList<Item> linkedListOfItems= new LinkedList<>();
        LinkedList<Item> linkedListOfItems2= new LinkedList<>();

        Stopwatch stopwatch = new Stopwatch();

        //Aufgabe 2 a)
        stopwatch.start();
        while (linkedListOfItems.size() < 100_000_000){
            linkedListOfItems.add(new Item("Schwert", "Waffe", 7.35, 600));

        }
        stopwatch.stopAndPrint();
        linkedListOfItems.clear();

        //Aufgabe 2 b)
        stopwatch.start();
        while (linkedListOfItems2.size() < 100_000_000){
            linkedListOfItems2.add(0, new Item("Schwert", "Waffe", 7.35, 600));

        }
        stopwatch.stopAndPrint();
        linkedListOfItems2.clear();

    }

}
