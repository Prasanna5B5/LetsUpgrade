package com.Day8;

public class Animals {
    String name;
    int age;
    public void getDetails(String n,int a){
        name=n;
        age=a;
    }
    public void showData(){
        System.out.println("Animal name: "+name+"  "+"Animal age:"+age);
    }
}
