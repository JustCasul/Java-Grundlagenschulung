package de.shd.schulung8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsAufgabe1 {

    public static void main(String[] args) {

        benutzerAbfrageAlter();

    }

    public static int benutzerAbfrageAlter(){
        Scanner ageScanner = new Scanner(System.in);
        System.out.print("Insert age: ");
        int age = 0;
        try {
            age = ageScanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Age must be a number.");
            benutzerAbfrageAlter();
        }

        return age;
    }

}
