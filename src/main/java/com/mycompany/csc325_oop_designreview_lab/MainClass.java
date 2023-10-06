/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;
/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 Student std1 = new Freshman("James", (short) 20, 12); // name, age, credits

	 Student std2 = new Senior("John", (short) 30, 90);

	 /* Scanner scans in users GPA, then prints it with
	 * the student information */
	 Scanner std1Sc = new Scanner(System.in);
	 System.out.print("Enter " + std1.getName() + "'s " + "GPA: ");
	 double std1ScGPA = std1Sc.nextDouble();
	 std1.setGpa(std1ScGPA);
	 System.out.println(std1);

	 Scanner std2Sc = new Scanner(System.in);
	 System.out.print("Enter " + std2.getName() + "'s " + "GPA: ");
	 double std2ScGPA = std2Sc.nextDouble();
	 std2.setGpa(std2ScGPA);
	 System.out.println(std2);

	}

}

