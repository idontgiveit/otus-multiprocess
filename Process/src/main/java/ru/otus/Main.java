package ru.otus;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        Process process = new ProcessBuilder("ls", "-l324")
                .directory(new File("."))
                .start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        System.out.println();
    }
}