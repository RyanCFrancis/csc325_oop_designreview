/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    private String address; //where the student lives
    private double gpa; //students gpa
    private int credits;
    public Student(String name, short age,int credits,String address, double gpa) {
        super(name, age);
        this.address = address;
        this.gpa = gpa;
        this.credits = credits;
    }

    //returns the students address
    @Override
    public String getAddress() {
        return this.address;
    }

    //changes the users address
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    //returns the user's gpa
    public double getGpa() {
        return gpa;
    }

    //edits the users gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //returns users credits
    public int getCredits() {
        return credits;
    }

    //edits users credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    // ToDo 1: Make this class a child of Human - done

	// ToDo 2: Fix the resulting errors - fixed constructor

	// ToDo 3: Add a field for GPA and create a setter and a getter - done
	
	// ToDo 4: Add comments to your code -done
}
