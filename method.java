package com.company;

public class method {
    static void change(int y, int[] arr) {
        arr[0] = y;
    }
    //return arr;



    public static void main(String[] args)
    {
        int [] marks = {51 ,73,77,89,98,94};
        int x =45;
        change(x ,marks);
        System.out.println(marks[0]);



    }
 }
