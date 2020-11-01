package com.Day8;

import java.util.Scanner;

public class designation {
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    public void getDetails(){
        System.out.println("enter name and age");
        name=sc.next();
        age=sc.nextInt();
    }
    public void displayDetails(){
        System.out.println(name+" "+age);
    }
}
