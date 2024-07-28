package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

    }

    public static void readFile(String filename) throws FileNotFoundException {
        FileReader file = new FileReader(filename);

    }
}
