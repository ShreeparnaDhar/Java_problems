package com.company;
import java.util.*;
public class InfyTQ_problem2 {
    public static void main(String[] args)
    {
        Scanner kb=new Scanner (System.in);
        String str = kb.next();
        int length =str.length();
        int half=length/2;

        if(length<2)
        {
            System.out.println("-1");
            System.exit(0);
        }
        for(int i=half;i>=0;i--)
        {
            String prefix = str.substring(0,i);
            String suffix = str.substring(length-i,length);
            if(suffix.equals("") || prefix.equals(""))

            {
             System.out.println("-1");
             System.exit(0);
            }
            if(suffix.equals(prefix))
            {
                System.out.println(suffix.length());
                break;
            }
        }
    }
}
