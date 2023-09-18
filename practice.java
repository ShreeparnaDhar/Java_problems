package com.company;


import java.sql.SQLOutput;

class Rectangle{
    private int leangth ;
    private int breath ;
    public Rectangle() {
        this.leangth = 4 ;
        this.breath = 5 ;

    }
    public Rectangle(int l ,int b) {
        this.leangth = l ;
        this.breath = b ;

    }

    public int getLeangth() {
        return leangth;
    }

    public int getBreath() {
        return breath;
    }
    public int area()
    {
        return leangth*breath;
    }
}

class Cylinder
{
    private int radius;
    private int hight;




    public Cylinder( int radius,int hight)
    {
        this.radius =radius;
        this.hight = hight;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    public double surfacearea()
    {
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*hight;
    }
    public double volume()
    {
        return 3.142 * radius * radius *hight;
    }
}

public class practice {
    public static void main(String[] args)
    {
        // Cylinder myCylinder = new Cylinder();
        Cylinder myCylinder = new Cylinder(9,12);

         myCylinder.setHight(12);


         int h = myCylinder.getHight();

         System.out.println(h);

        myCylinder.setRadius(9);

        System.out.println(myCylinder.getRadius());

        System.out.println("the surface area is " + myCylinder.surfacearea());

        System.out.println("the volume is " +myCylinder.volume());

        //problem 3

        Rectangle rect = new Rectangle();
        Rectangle r = new Rectangle(12,13);
        System.out.println(r.getLeangth());
        System.out.println(r.getBreath());
        System.out.println(r.area());

    }
}
