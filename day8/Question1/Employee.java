package com.Day8;

import java.util.Scanner;

public class Employee {
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    double salary;
    String designation;
    public void getDetails(){
        System.out.println("enter name,age,Salary and designation");
        name=sc.next();
        age=sc.nextInt();
        salary=sc.nextDouble();
        designation= sc.next();
    }
    public void displayDetails(){
        System.out.println(name+" "+age+" "+salary+" "+designation);
    }
}
