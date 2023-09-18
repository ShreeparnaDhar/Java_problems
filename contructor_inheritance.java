package com.company;

import java.sql.SQLOutput;

class Base1
{
    Base1()
    {
        System.out.println("I am a Constructor");
    }
    Base1(int x , int y)
    {
        System.out.println("I am a overloaded constructor with value of x as" + x +" " +y);
    }
}

 class derive1 extends Base1{

    derive1()
    {
       super();
        System.out.println("I am a derive class constructor");

    }
    derive1(int x ,int y)
    {
        super(x,y);
        System.out.println(" I am a derive class overloaded constructor" );
    }
 }

public class contructor_inheritance {
    public static void main(String[] args) {
       derive1 d = new derive1(9,6);
        Base1 b = new Base1(4 , 9);
        
    }
}
