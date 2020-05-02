package com.abhishekVelankar;

import java.util.ArrayList;
import java.util.List;

public class Student implements ISaveable {

    private String name;
    private int rollno;
    private double per;
    private String remark;

    public Student(String name, int rollno, double per) {
        this.name = name;
        this.rollno = rollno;
        this.per = per;
        this.remark = "Excellent";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public double getPer() {
        return per;
    }

    public String getRemark() {
        return remark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", per=" + per +
                ", remark='" + remark + '\'' +
                '}';
    }

    @Override
    public List<String> writeValues() {

        List<String> myValues = new ArrayList<String>();
        myValues.add(0,this.name);
        myValues.add(1,""+this.rollno);
        myValues.add(2,""+this.per);
        myValues.add(3,this.remark);

        return myValues;
    }

    @Override
    public void readValues(List<String> savedValues) {

        if(savedValues != null){
            this.name = savedValues.get(0);
            this.rollno = Integer.parseInt(savedValues.get(1));
            this.per = Double.parseDouble(savedValues.get(2));
            this.remark = savedValues.get(3);

        }

    }
}
