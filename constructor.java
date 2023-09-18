package com.company;

class Base
{
    int x;

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }
    public void printme()
    {
        System.out.println( "I am superclass");
    }
}

class Derived extends Base
{

    int y;

    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }



}

public class constructor {
    public static void main(String[] args)
    {
       Base g = new Base();
        Derived B = new Derived();
        B.setX(4);
        System.out.println(B.getX());
        g.printme();
        B.setY(9);


    }

}
