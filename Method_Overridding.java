package com.company;

class D
{
    public int harry()
    {
        return 4;
    }
    public void meth2()
    {
        System.out.println("T am the method 2 of class A");
    }
}

class B extends D
{
    @Override //
    public void meth2()
    {
        System.out.println("T am the method 2 of class B");
    }
    public void meth3()
    {
        System.out.println("I am method 3 of class B");
    }

}
public class Method_Overridding {
    public static void main(String[] args)
    {
        D a = new D();
        B b = new B();

        a.meth2();
        b.meth2();
    }

}
