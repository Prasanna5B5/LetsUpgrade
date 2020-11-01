package com.Day8;

import java.util.Scanner;

public class Employee {
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    double salary;
    public void getData(){
        System.out.println("enter employee name:");
        name=sc.next();
        System.out.println("enter employee age:");
        age=sc.nextInt();
        System.out.println("enter employee salary:");
        salary=sc.nextDouble();
    }
    public void putData(){
        System.out.println(name+"\t"+age+"\t"+salary);
    }
}
