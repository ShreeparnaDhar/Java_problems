package com.company;

public class method_overloading {
    static void foo()
    {
        System.out.println("Good mor");
    }
    static void foo(int a)
    {
        System.out.println("Game beging"+" "+ a);
    }
    static void foo(int x,int y)
    {
        System.out.println("Game beging"+" "+ (x+y));
        //return b;
    }
    public static void main(String []args)
    {
        int a =599;
        int b =99;

        foo();
        foo(a);
        foo(a,b);
    }
}
