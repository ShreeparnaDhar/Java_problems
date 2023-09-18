package com.company;
interface cyclehorn
{
    void K2G();
    void mhn();
}
interface  bicycle
{
    int a =9;
    void applyBreak(int decrement);
    void SpeedUp(int increment);
}
class cycle implements bicycle , cyclehorn
{
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    int speed ;


    @Override
    public void applyBreak(int decrement) {

        speed = speed - decrement;

    }

    @Override
    public void SpeedUp(int increment) {
        int decrement = 0;
        speed = speed + decrement;

    }
   public void K2G()
    {
        System.out.println("Kabhi kushi kabhi gum");
    }
    public void mhn()
    {
        System.out.println("main hon nah");
    }

}
public class interfaces {
    public static void main(String[] args)
    {
    cycle c = new cycle();
    c.setSpeed(600);
    c.applyBreak(5);
    c.SpeedUp(99);
        System.out.println( c.getSpeed());
        System.out.println(c.a);
        c.K2G();
        c.mhn();


    }
}
