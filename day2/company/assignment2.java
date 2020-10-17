package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int db,mb,yb,monthly_salary,tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter date of birth");
        db=sc.nextInt();
        System.out.println("enter birth month");
        mb=sc.nextInt();
        System.out.println("enter birth year");
        yb=sc.nextInt();
        System.out.println("enter monthly salary");
        monthly_salary=sc.nextInt();
        int age=2020-yb;
        int annual_salary=(monthly_salary*12);
        if(annual_salary>=500000){
            tax=(annual_salary*20)/100;
            System.out.println("Hi "+name+" age "+age+ " annual salary "+annual_salary+" tax amount "+tax);
        }
        else if(annual_salary>=400000){
            tax=(annual_salary*15)/100;
            System.out.println("Hi "+name+" age "+age+" annual salary "+annual_salary+" tax amount "+tax);
        }
        else if(annual_salary>=300000){
            tax=(annual_salary*10)/100;
            System.out.println("Hi "+name+" age "+age+" annual salary "+annual_salary+" tax amount "+tax);
        }
        else if(annual_salary>=200000){
            tax=(annual_salary*5)/100;
            System.out.println("Hi "+name+" age "+age+ " annual salary "+annual_salary+" tax amount "+tax);
        }
        else{
            System.out.println("Hi "+name+" age "+age+" annual salary "+annual_salary+" no tax amount");
        }


    }
}
