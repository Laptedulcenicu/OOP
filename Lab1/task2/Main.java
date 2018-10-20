package com.nicu.Lab1.task2;

public class Main {
    public static void main(String[] args) {
float mark1;
float mark2;
float mark3;
        Student student1 = new Student("Marius",20,5.50f);
        Student student2= new Student("Ina",13,9.70f);
        Student student3 = new Student("Vergiu",21,10.00f);
        Student student4= new Student("Natalia" ,17, 7.80f);
        Student student5= new Student("Dinu", 19,8.80f);
        Student student6= new Student("Vitea", 20, 9.10f);
        Student student7 = new Student("Vasea",20,6.60f);
        Student student8 = new Student("Vasea", 21, 9.99f);
        Student student9 = new Student("Ion", 20, 8.80f);
        Student student10 = new Student("Jora",22, 4.56f);
        University univer1= new University("ASEM",1969);
        University univer2= new University("USM",1999);
        University univer3= new University("UCCM",1945);
        Student[] array = new Student[10];
        array[0]=student1;
        array[1]=student2;
        array[2]=student3;
        array[3]=student4;
        array[4]=student5;
        array[5]=student6;
        array[6]=student7;
        array[7]=student8;
        array[8]=student9;
        array[9]=student10;
        mark1=(array[0].getmark()+array[1].getmark()+array[2].getmark()+array[3].getmark())/4;
        mark2=(array[4].getmark()+array[5].getmark()+array[6].getmark())/3;
        mark3=(array[7].getmark()+array[8].getmark()+array[9].getmark())/3;
        System.out.println(univer1.toString());
        System.out.println(array[0].toString());
        System.out.println(array[1].toString());
        System.out.println(array[2].toString());
        System.out.println(array[3].toString());
        System.out.printf("Meida e %.2f\n", mark1);
        System.out.println(univer2.toString());
        System.out.println(array[4].toString());
        System.out.println(array[5].toString());
        System.out.println(array[6].toString());
        System.out.printf("Meida e %.2f\n", mark2);
        System.out.println(univer1.toString());
        System.out.println(array[7]);
        System.out.println(array[8].toString());
        System.out.println(array[9].toString());
        System.out.printf("Meida e %.2f\n", mark3);


    }
}

