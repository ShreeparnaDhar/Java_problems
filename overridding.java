package com.company;
class y
{
    public int shipu()
    {
        return 4;
    }
    public void method2()
    {
        System.out.println("I am the method 2 of class y");
    }
}
class j extends y
        {
            public void method2(int a)
            {
                System.out.println("I am the method 2 of class j");
            }

        }

public class overridding {
    public static void main(String[] args) {
        /*y a = new y();
        a.method2();*/
        j J = new j();
        J.method2();
    }
}
