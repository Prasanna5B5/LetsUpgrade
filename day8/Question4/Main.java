package com.Day8;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Employee[] e=new Employee[3];
       int i;
       for(i=0;i<3;i++)
           e[i]=new Employee();
       for(i=0;i<3;i++){
           System.out.println("Enter details of"+(i+1)+"Employee");
           e[i].getData();
       }
        System.out.println("Details of Employees");
       for(i=0;i<3;i++)
           e[i].putData();
    }
}
