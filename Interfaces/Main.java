package com.abhishekVelankar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student Abhishek = new Student("Abhishek",23163,95.8);

        System.out.println(Abhishek.toString());
        Abhishek.setRemark("Too good !!");
        saveObject(Abhishek);
        loadObject(Abhishek);
        System.out.println(Abhishek.toString());

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable saveObject) {
        for(int i=0; i<saveObject.writeValues().size(); i++) {
            System.out.println("Saving the " + saveObject.writeValues().get(i) +" into the file");
        }
    }

    public static void loadObject(ISaveable loadObject) {
        List<String> values = readValues();

        loadObject.readValues(values);
    }
}
