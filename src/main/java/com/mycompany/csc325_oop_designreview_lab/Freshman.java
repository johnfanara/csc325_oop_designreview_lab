package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    @Override
    public String toString() {
        return "Freshman(Name: " + getName() + ", Age: " + getAge()  + ", Credits: " + getCredits()  +  ", GPA: " + getGpa() + ")";
    }
}
