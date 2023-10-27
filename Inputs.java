package com.pradeep;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.print("Please enter some input:");
//        int rollno=input.nextInt();
//        System.out.println("Your roll no is "+rollno);
//        int a=10; //here 10 is called literal
//        int b=234_000_000;//instead of comma we use _ to represent million
//        String name=input.nextLine();
//        System.out.println(name);
        float marks=input.nextFloat(); //when int is given ie 10 then we get input 10.0
        System.out.println(marks);
    }
}
