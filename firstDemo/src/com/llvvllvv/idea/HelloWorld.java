package com.llvvllvv.idea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.stream.Stream;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        new Date();
    }

    public static void testDD() {
        extracted();
    }

    private static void extracted() {
        try {
            FileInputStream file = new FileInputStream("tex≈t.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            final float f;
        }
        new HashMap<>();
    }


}
