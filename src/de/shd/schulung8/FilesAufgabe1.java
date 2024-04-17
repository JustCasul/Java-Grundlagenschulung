package de.shd.schulung8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesAufgabe1 {

    public static void main(String[] args) {

        Path absolutePath = Path.of("C:\\Users\\seminar\\IdeaProjects\\SHD Java Grundlagenschulungsprojekt\\src\\schulung8\\test.txt");
        try {
            Files.createFile(absolutePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path relativePath = Path.of("test1.txt");
        try {
            Files.createFile(relativePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        fileWritingWithRessourcesAbsolute();
        fileReadingWithRessourcesAbsolute();
        fileWritingWithRessourcesRelative();
        fileReadingWithRessourcesRelative();

    }

    private static void fileWritingWithRessourcesAbsolute () {
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("C:\\Users\\seminar\\IdeaProjects\\SHD Java Grundlagenschulungsprojekt\\src\\schulung8\\test.txt"))){
            bw.write("Hallo Welt Absolute");
        } catch (IOException e){
            System.out.println("Es ist ein Fehler aufgetreten.");
        }
    }

    private static void fileReadingWithRessourcesAbsolute () {
        try (BufferedReader br = Files.newBufferedReader(Path.of("C:\\Users\\seminar\\IdeaProjects\\SHD Java Grundlagenschulungsprojekt\\src\\schulung8\\test.txt"))){
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println("Es ist ein Fehler beim lesen der Datei aufgereten!");
        }

    }
    private static void fileWritingWithRessourcesRelative () {
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("test1.txt"))){
            bw.write("Hallo Welt Relative");
        } catch (IOException e){
            System.out.println("Es ist ein Fehler aufgetreten.");
        }
    }

    private static void fileReadingWithRessourcesRelative () {
        try (BufferedReader br = Files.newBufferedReader(Path.of("test1.txt"))){
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println("Es ist ein Fehler beim lesen der Datei aufgereten!");
        }

    }


}
