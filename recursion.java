package com.company;

public class recursion {
    static int fact(int n)
    {
       // int x=0;
        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }

    }

    public static void main(String[] args) {
        int x=7;
        System.out.println("FACTORIA IS "+ fact(x));
    }
}
