package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int sum=0;
        System.out.println("the array elements are");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        System.out.println("the sum of array elements "+ sum);
    }
}
