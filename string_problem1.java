package com.company;

public class string_problem1 {
    //problem_1
    public static  void main(String[] args) {
        String name = "Shreeparna Dhar";
        name = name.toLowerCase();
        System.out.println(name);
        //problem 2
        String text= "To Lower Case";
        text=text.replace(" ","__");
        System.out.println(text);
        //problem 3
        String letter =" Dear <|name|>, Thanks a lot!";
        letter =letter.replace("<|name|>","ouou");
        System.out.println(letter);
        //problem 4
        String myString ="This string contain double  and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        //problem 5
        String letter2 ="Dear harry,\n\t this java course is nice .\n\t\tThanks";
        System.out.println(letter2);



    }

}
