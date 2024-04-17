package de.shd.schulung8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedWriterExample {

    public static void main(String[] args) {
        fileWritingWithTry();
        fileWritingWithRessources();
        fileReadingWithRessources();
    }

    private static void fileReadingWithRessources () {
        try (BufferedReader br = Files.newBufferedReader(Path.of("text.txt"))){
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println("Es ist ein Fehler beim lesen der Datei aufgereten!");
        }

    }

    private static void fileWritingWithRessources () {
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("test.txt"))){
            bw.write("Hallo Welt");
        } catch (IOException e){
            System.out.println("Es ist ein Fehler aufgetreten.");
        }
    }

    private static void fileWritingWithTry () {
        BufferedWriter bw = null;
        try{
            bw = Files.newBufferedWriter(Path.of("test.txt"));
            bw.write("Hallo Welt");
        } catch (IOException e){
            System.out.println("Es ist ein Fehler aufgetreten.");
            e.printStackTrace();
        } finally {
            if (bw != null){
                try{
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Es ist ein Fehler aufgetreten.");
                }
            }
        }
    }

}
