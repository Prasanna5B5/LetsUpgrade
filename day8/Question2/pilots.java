package com.Day8;

import java.util.Scanner;

public class pilots extends designation{
    Scanner sc=new Scanner(System.in);
    String skills;
    String Qualification;
    public void Data(){
        skills=sc.next();
        Qualification=sc.next();
    }
    public void setData(){
        System.out.println(skills+" "+Qualification);
    }
}
