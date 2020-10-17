package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s1,s2,s3,s4,s5;
        float total,percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the subject marks");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        s4=sc.nextInt();
        s5=sc.nextInt();
        total=s1+s2+s3+s4+s5;
        percentage=(total/500)*100;
        System.out.println("the total value is" +total);
        System.out.println("the percentage is" +percentage);
        if(percentage<50){
            System.out.println("c grade");
        }
        else if((percentage>=50)&&(percentage<70)){
            System.out.println("b grade");
        }
        else{
            System.out.println("a grade");
        }
    }
}
