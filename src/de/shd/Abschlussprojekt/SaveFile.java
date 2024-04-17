package de.shd.Abschlussprojekt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SaveFile {

    private static String fileName = "AlienEscapeSave.csv"; //Speicherort

    public static void main(String[] args) {
        save();
        load();
    }

    //Speichert die Datei
    private static void save() {
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("AlienEscapeSave.csv"))) {
            bw.write("Hallo Welt");
        } catch (IOException e) {
            System.out.println("***Error: Failed saving File***");
        }
    }

    //Lädt die Datei
    private static void load() {
        try (BufferedReader br = Files.newBufferedReader(Path.of("AlienEscapeSave.csv"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println("***Error: Failed loading File!***");
        }
    }
}