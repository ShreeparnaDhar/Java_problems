package com.company;

public class A {
    public static final Double PI = 3.14;

    public static void main(String []args)
    {
        int n1=72, n2 =120, gcd=1;
        for(int i=1;i<=n1 && i<=n2;++i)
        {
            if(n1%i==0 && n2%i==0)
                gcd=i;
        }
        int lcm = (n1*n2)/gcd ;
        System.out.printf(" the lcm of %d and %d is %d ",n1,n2,lcm);

    }
}
