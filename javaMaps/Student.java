
package com.abhishekVelankar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

    private String name;
    private String grade;
    private char division;
    private float percentage=0;
    private ArrayList<String> subjects = new ArrayList<>();

    private Map<String, Integer> marks = new HashMap<>();


    public Student(String name, char division) {
        this.name = name;
        this.division = division;
        subjects.add("Maths");
        subjects.add("Ads");
        subjects.add("MicroP");
        subjects.add("CG");
        subjects.add("FCCN");
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        if (evalPercentage() > 80) {
            return "Excellent";
        } else if (evalPercentage() > 70) {
            return "Good";
        } else if (evalPercentage() < 40) {
            return "Fail";
        }
        return "Average";
    }

    public char getDivision() {
        return division;
    }

    public void setMarks() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the marks in five subjects for " + name + " :");
        int temp;
        ArrayList<Integer> m = new ArrayList<>();
        for (int i=0; i<5; i++) {
             temp = scan.nextInt();
             marks.put(subjects.get(i), temp);
        }
    }

    public float evalPercentage() {
        return (marks.get("Maths") + marks.get("Ads") + marks.get("MicroP") + marks.get("CG")
                    + marks.get("FCCN"))/5;
    }

}
