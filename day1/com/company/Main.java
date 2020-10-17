package com.company;

public class Main {

    public static void main(String[] args) {
        employee e=new employee();
        e.name="prasanna";
        e.age=21;
        e.city="tirupathi";
        employee e1=new employee();
        e1.name="siri";
        e1.age=22;
        e1.city="chittor";
        e.display();
        e1.display();
    }
}
