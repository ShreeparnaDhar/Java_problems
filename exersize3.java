package com.company ;
import com.sun.security.jgss.GSSUtil;

import java.util.Random ;
import java.util.Scanner ;

class Game
{
     public int num;
     public int num2;
     public int noOfGuesses=0;
     Game()
     {
         Random ran = new Random();
         this.num = ran.nextInt(100);
     }

     void take_user_input()
     {

         System.out.println("guess the  number");
         Scanner sc = new Scanner(System.in);
         num2 = sc.nextInt();

     }
     boolean Is_correct_number()
     {
         noOfGuesses++;
          if(num == num2)
          {
              System.out.println("YES you guess it right at "+noOfGuesses);
              return true;
          }
          else if (num<num2)
          {
              System.out.println("too high..");
          }
          else if (num>num2)
          {
              System.out.println("too low..");
          }
          return false;
     }
}

  public class exersize3 {
    public static void main( String[] args)
    {
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.take_user_input();
            b = g.Is_correct_number();
            System.out.println(b);
        }

    }
}
