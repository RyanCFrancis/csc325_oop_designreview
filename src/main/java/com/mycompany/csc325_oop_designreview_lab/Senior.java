package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    public Senior(String name, short age, int credits, String address, double gpa) {
        super(name, age, credits, address, gpa);
        if (credits < 85){
            this.setCredits(85);
        }
    }

    @Override
    public String toString(){
        return super.toString() + " and has " + this.getCredits() + " credits";
    }
}
