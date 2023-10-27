package com.pradeep;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a temp in Celcius:");
        float c=input.nextFloat();
        float f=(c*9/5)+32;
        System.out.println(f);

    }
}
