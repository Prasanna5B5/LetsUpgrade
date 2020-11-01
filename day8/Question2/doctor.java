package com.Day8;

import java.util.Scanner;

public class doctor extends designation{
    Scanner sc=new Scanner(System.in);
    int roomNo;
    String specialist;
    public void Details(){
        roomNo=sc.nextInt();
        specialist=sc.next();
    }
    public void display(){
        System.out.println(roomNo+" "+specialist);
    }

}
