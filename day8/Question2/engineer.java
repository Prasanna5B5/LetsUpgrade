package com.Day8;

import java.util.Scanner;

public class engineer extends designation {
    Scanner sc=new Scanner(System.in);
    String spec;
    int yoj;
    double sal;
    public void getData(){
        spec=sc.next();
        yoj=sc.nextInt();
        sal=sc.nextDouble();
    }
    public void putData(){
        System.out.println(spec+" "+yoj+" "+sal);
    }
}
