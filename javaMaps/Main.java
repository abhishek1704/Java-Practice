package com.abhishekVelankar;

public class Main {

    public static void main(String[] args) {
        Student abhishek = new Student("Abhishek", 'A');
        Student aditya = new Student("Aditya", 'B');
        Student chinmay = new Student("Chinmay", 'A');

        abhishek.setMarks();
        aditya.setMarks();
        chinmay.setMarks();

        System.out.println("RESULT :");
        System.out.println(abhishek.getName() + " has got " + abhishek.evalPercentage() + " % with grade of " + abhishek.getGrade());
        System.out.println(aditya.getName() + " has got " + aditya.evalPercentage() + " % with grade of " + aditya.getGrade());
        System.out.println(chinmay.getName() + " has got " + chinmay.evalPercentage() + " % with grade of " + chinmay.getGrade());
    }
}
