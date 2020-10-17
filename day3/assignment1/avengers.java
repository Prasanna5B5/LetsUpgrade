package com.company;

import java.util.Scanner;

public class avengers {
    String name,power,weapon,planet;
    int age;
    Scanner sc=new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("enter the age");
        age=sc.nextInt();
        System.out.println("enter the power");
        power=sc.next();
        System.out.println("enter the weapon");
        weapon=sc.next();
        System.out.println("enter the planet");
        planet=sc.next();
    }
    public void displayDetails(){
        System.out.println("the name is "+name+" age "+age+" power "+power+" weapon "+weapon+" planet "+planet);
    }

}
