package de.shd.schulung8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsAufgabe2 {

    public static void main(String[] args) {

        benutzerAbfrageName();

    }

    public static String benutzerAbfrageName() throws InputMismatchException {
        Scanner nameScanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = nameScanner.next();
        if (name.matches("[a-zA-Z]+.*")){
            return name;
        }else {
            throw new InputMismatchException();
        }
    }
}
