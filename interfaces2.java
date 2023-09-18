package com.company;

import com.sun.source.tree.ReturnTree;
import org.w3c.dom.ls.LSOutput;

interface camera
{
    void takesnap();
    void recordVideo();
   default void record4kvideo()
   {
       System.out.println("recording in 4k");
       great();
   }
    private void great()
    {
        System.out.println("HELLO");

    }

}
interface wifi
{
    String[] getNetworks();
    void ConnectTonetwork(String network);

}
class Mycellphone{
   public void callNumber(int num)
    {
        System.out.println("calling"+ num);
    }
   public void piccall()
    {
        System.out.println("connecting....");
    }


}
class Smart_phone extends Mycellphone implements wifi,camera
{
    public void takesnap()
    {
        System.out.println("TAKE SNAP");
    }
    public void recordVideo()
    {
        System.out.println("TAKE VIDEO");
    }
  /* public void record4kvideo()
    {
        System.out.println("taking snap and recording ....in 4k");
    }*/
   public  String[] getNetworks()
   {
       System.out.println("Getting list of networks");
       String[] ns={"SHRI","TITLI","MAA"};
       return ns;
   }
    public void ConnectTonetwork(String Network)
    {
        System.out.println("conecting to..." + Network);
    }

}
public class interfaces2 {
    public static void main (String[] args)
    {
    Smart_phone u = new Smart_phone();
    u.record4kvideo();
   // u.great();  //we can not direct call private interfaces method throw error

    u.takesnap();
    u.recordVideo();
    String[] ar =u.getNetworks();
         for(String item :ar)
        u.ConnectTonetwork(item);

    }
}
