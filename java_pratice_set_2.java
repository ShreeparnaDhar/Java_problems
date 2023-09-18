package com.company;
import java.util.Scanner;


public class java_pratice_set_2 {
    public static void main(String [] args)
    {
        byte m1,m2,m3;
        System.out.println("Enter your marks in Physics");
        System.out.println("Enter your marks in math");
        System.out.println("Enter your marks in Chemistry");
        Scanner sc = new Scanner(System.in);
        m1=sc.nextByte();
        m2=sc.nextByte();
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
            System.out.println("pass");
        else
            System.out.println("fail");

    }
}
