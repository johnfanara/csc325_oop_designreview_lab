/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    private int credits;
    private double gpa;

    //constructor that takes 3 params
    public Student (String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    /* Im pretty sure i could have just deleted getAddress since
    it's never used, but i decided to not remove it*/
    @Override
    public String getAddress() { return null; }
    @Override
    public void setAddress(String address) { }

    //getter and setter for GPA
    public double getGpa() { return gpa; }

    public void setGpa(double gpa) { this.gpa = gpa; }

    //getter and setter for credits
    public int getCredits() { return credits; }

    public void setCredits(int credits) { this.credits = credits; }

    //to string method to print student and GPA
    @Override
    public String toString() {
        return "Student(Name: " + getName() + ", Age: " + getAge() + ", " + "Credits: " + getCredits() +  ", GPA: " + getGpa() + ")";
    }
}
