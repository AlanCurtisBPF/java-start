package com.alan.loggers;

import java.io.File;
import java.io.IOException;

public class MakeFile {
    public static void main(String[] args) {
        System.out.println("Make file ran");
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}