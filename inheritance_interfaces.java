package com.company;
interface sample
{
    void meth1();

   void meth2();
}
interface childsample extends sample
{
    void meth3();

    void meth4();
}
class myclass implements childsample
{

    public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2");
    }
    public void meth3()
    {
        System.out.println("meth3");
    }
    public void meth4()
    {
        System.out.println("meth4");
    }
}
public class inheritance_interfaces
{
    public static void main(String[] args)
    {

        myclass c = new myclass();

        c.meth1();

        c.meth2();

        c.meth3();

        c.meth4();



    }

}
