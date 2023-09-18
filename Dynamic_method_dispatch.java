package com.company;

import org.w3c.dom.ls.LSOutput;

class phone
{
    public void great()
    {
        System.out.println("Good morning");
    }
    public void name()
    {
        System.out.println("on phone");
    }

}
class smartphone extends phone{
    public void swagat()
    {
        System.out.println("Apka swagat hai");
    }
    public void name()
    {
        System.out.println("Turning on smartphone");
    }
    public void music()
    {
        System.out.println("play the music");
    }


}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.great();
        obj.name();
        //obj.music()


    }
}
