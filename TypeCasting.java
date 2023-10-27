package com.pradeep;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        float num=input.nextFloat(); //implicit typecasting means automatic conversion from one datatype to other
//        // The two req to convert is that it must be compatible and destination dtype must be greater than assigned one.
////        int num2=input.nextInt();//if you give float input then it wont work
//        System.out.println(num);

        //explicit typecasting is the programmer must convert it like int to float also known as narrowing since small dtype to large

//        int num3=(int)(23.34);
//        System.out.println(num3);
//        //automatic type promotion in expressions
//        int a=257;
//        byte b=(byte)(a);//since max value of byte is 256 we get o/p as 257%256
//        System.out.println(b);


//        byte a=50;
//        byte b=40;
//        byte c=100;
//        int d=a*b/c; //here java automatically converts a*b ie 2000 to int and does division.
//        System.out.println(d);

//        byte d=50;
//        d=d*20;//this gives error since 2 is int
//        int number='A';
//        System.out.println(number); //this gives 65 because of unicode values


        byte b=23;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=5.4345;
        double result=(f*b)+(i/c)-(d*s);//the greater dtype is the result
        //float+int-double=double
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
    }
}
