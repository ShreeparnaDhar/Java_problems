package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

abstract class parent
{
    public parent(){
        System.out.println("base1 constructor");

    }
    public void  sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();

}
class child extends parent{
    public void greet()
    {
        System.out.println("Good morning");
    }

}
abstract class child2 extends child{
    public void th()
    {
        System.out.println("I am good");
    }
}
public class Abstract {
    public static void main(String[] args) {
       // parent p = new parent();
        child c = new child();
        //c.th();


    }
}
