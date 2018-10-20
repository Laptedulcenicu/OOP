package com.nicu.Lab1;

public class Main1 {

    public static void main(String args[]) {

        Object first = new Object();
        one.color = "black";
        one.height = 200;
        one.width = 200;
        one.widthPixels = 512;
        one.heightPixels = 1024;

        Object second = new Object();
        two.color = "red";
        two.height = 400;
        two.width = 400;
        two.widthPixels = 1920;
        two.heightPixels = 1080;


        first.printObject();
        System.out.println();
        second.printObject();
        System.out.println();

        Compare compare = new Compare();
        compare.compare1(first, second);
    }


}
