package com.company;
//package com.tatha;
import java.lang.Math;
class sc //shortcut
{
    public static void nl() //for New Line
    {
        System.out.println();
    }
    public static void star() //for *
    {
        System.err.print("*");
    }
    public static void dot() //for .
    {
        System.err.print(".");
    }
    public static void space() //for space
    {
        System.out.print(" ");
    }

}


class I
{
    public void show()
    {
        for(int a=0;a<5;a++)
        {
            System.out.print("/");
        }
        sc.nl();
        for(int b=0;b<3;b++)
        {
            for(int c=0;c<5;c++)
            {
                if(c==2)
                {
                    System.out.print("/");
                }
                else
                    sc.space();
            }
            sc.nl();
        }
        for(int d=0;d<5;d++)
        {
            System.out.print("/");
        }
    }
}

class Love {
    public void show() {

        final int size = 4;


        for (int m = 0; m < size; m++) {
            for (int n = 0; n <= 4 * size; n++) {
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if (pos1 < size + 0.5 || pos2 < size + 0.5) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }

        for (int m = 1; m <= 2 * size; m++) {
            for (int n = 0; n < m; n++) {
                System.out.print(' ');
            }
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());
        }
    }

 }



    class U {
        public void show() {
            for (int b = 0; b < 4; b++) {
                for (int a = 0; a < 5; a++) {
                    if (a == 0 || a == 4) {
                        System.out.print("!");
                    } else
                        System.out.print(" ");
                }
                sc.nl();
            }
            for (int c = 0; c < 5; c++) {

                if (c == 0) {
                    System.out.print("\\");
                } else if (c == 4) {
                    System.out.print("/");
                } else {
                    System.out.print("_");
                }

            }

        }
    }

    public class TryILU {

        public static void main(String[] args) {

            I i = new I();
            Love l = new Love();
            U u = new U();
            sc sc = new sc();
            i.show();
            sc.nl();
            sc.nl();
            l.show();
           // l.RP();
           //  l.show();
            sc.nl();
            sc.nl();
            u.show();


        }
    }





