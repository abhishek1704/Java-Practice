package com.company;

public class BankAccount {

    private int accNo,balance,phoneNo;
    private String customerName,email;

    public BankAccount(int accNo,int balance,int phoneNo,String customerName,String email)
    {
        System.out.println("Parameterized constructor called !");
        this.accNo = accNo; // here in java, "this" is eventually a object, not a pointer as java doesn't have concept of pointers
        this.balance = balance;
        this.email = email;
        this.phoneNo = phoneNo;
        this.customerName = customerName;
    }

    public BankAccount(int accNo) {
        this(accNo,87643,76574,"kfie","khcievfv");// calling original main constructor from partial constructor

        this.accNo = accNo;
    }

    public void setData()
    {
        System.out.println("No need of setData!");
    }

    public void getData()
    {
        System.out.println("The user's bank details are: ");
        System.out.println(customerName + "  " + accNo + "  " + balance);
    }
}
