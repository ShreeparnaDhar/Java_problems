package com.company;
import java.util.Scanner;

class function {
    String[] books;
    int no_of_books;

    function() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void add_books(String book)

    {
     this.books[no_of_books] = book;
     no_of_books++;
        System.out.println(book+" has been added");
    }

}
public class Library {
    public static void  main(String[] args)
    {
         function f = new function();
         Scanner sc = new Scanner(System.in);
         int n =6;
         //String arr = sc.nextLine();
         for(int i=0;i<n;i++)
         {

            //sc.close();
             f.add_books(sc.nextLine());
         }

    }
}
