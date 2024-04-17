package de.shd.schulung7;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

    public static void main(String[] args) {

        List<String> listOfStrings= new ArrayList<>();
        final boolean empty = listOfStrings.isEmpty();
        listOfStrings.add("of");
        listOfStrings.add("Legends");


        for (String string : listOfStrings){
            System.out.println(string);
        }

        listOfStrings.add(0,"League");

        for (String string : listOfStrings){
            System.out.println(string);
        }

    }

}
