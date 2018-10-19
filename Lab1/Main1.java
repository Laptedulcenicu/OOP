package com.nicu.Lab1;

public class Main1 {

    public static void main(String args[]) {

        Object one = new Object();
        one.color = "black";
        one.height = 200;
        one.width = 200;
        one.widthPixels = 640;
        one.heightPixels = 890;

        Object two = new Object();
        two.color = "blue";
        two.height = 500;
        two.width = 500;
        two.widthPixels = 840;
        two.heightPixels = 1000;


        one.printObject();
        System.out.println();
        two.printObject();
        System.out.println();

        Compare abc = new Compare();
        abc.compare1(one, two);
    }


}
