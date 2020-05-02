package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100000,200000,75889487,"Abhishek","abc@gmail.com");
        BankAccount myacc = new BankAccount(189);
        acc.setData();
        acc.getData();
        System.out.println("");
        myacc.setData();
        myacc.getData();
    }
}