package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        avengers[] av=new avengers[5];
        for(int i=0;i<5;i++){
            av[i]=new avengers();
            av[i].getDetails();
        }
        for(int i=0;i<5;i++){
            av[i].displayDetails();
        }
    }
}
