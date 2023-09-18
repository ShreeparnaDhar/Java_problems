package com.company;
import java.util.*;
public class NonRepatedDigitCount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int a[] = new int[10];
        int i, r,c=0;
        while(in1!=0)
        {
            r= in1%10;
            a[r]++;
            in1=in1/10;
        }
        for(i=0;i<10;i++)
        {
            if(a[i]==1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
