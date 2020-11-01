package com.Day8;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Animals[] a=new Animals[3];
         a[0]=new Animals();
         a[1]=new Animals();
         a[2]=new Animals();
         a[0].getDetails("lion",20);
         a[1].getDetails("rabbit",15);
         a[2].getDetails("Dog",18);
         System.out.println("enter animal 1:");
         a[0].showData();
         System.out.println("enter animal 2:");
         a[1].showData();
         System.out.println("enter animal 3");
         a[2].showData();

    }
}
