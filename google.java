package com.company;

public class google {
    public static void main(String[] args)
    {

        int n =  4;
        for (int i=n; i>0; i--)
        {
            for (int j=0; j<i; j++)
        {
                System.out.print("*");
        }
        System.out.print("\n");
       }
        //problem 2
        int sum=0;
        //int n=5;
        for(int i=0;i<n;i++)
        {
            sum+=(2*i);


        }
        System.out.println(sum);
  int m=6;
  for(int i=10;i>=1;i--)
  {
     System.out.printf("%d * %d = %d \n",m,i,m*i);
  }
        for(int i=1;i<11;i++)
        {
            System.out.printf("%d * %d = %d \n",m,i,m*i);
        }
        int i=1;
        int fact=1;
        int w=4;
    while(i<=w)
    {
        fact*=i;
        i++;
    }
    System.out.println(fact);

        //practice problem 1
        // //
    }
}
