package com.nicu.Lab1;

public class Main2 {

    public static void main(String args[]) {
        Student one = new Student();
        one.name = "Ana";
        one.age = 19;
        one.mark = 10;
        one.university = "UTM";

        Student two = new Student();
        two.name = "Adrian";
        two.age = 20;
        two.mark = 4.99f;
        two.university = "ULIM";

        Student three = new Student();
        three.name = "Nina";
        three.age = 20;
        three.mark = 9.85f;
        three.university = "ASEM";

        Student four = new Student();
        four.name = "Margareta";
        four.age = 20;
        four.mark = 9.99f;
        four.university = "UTM";


        University utm = new University();
        utm.name = "UTM";
        utm.foundationYear = 1964;
        utm.lista = new Student [2];
        utm.lista[0] = one;
        utm.lista[1] = four;

        University asem = new University();
        asem.name = "ASEM";
        asem.foundationYear = 1991;
        asem.lista = new Student[1];
        asem.lista[0] = three;

        University ulim = new University();
        ulim.name = "ULIM";
        ulim.foundationYear = 1992;
        ulim.lista = new Student[1];
        ulim.lista[0] = two;

        utm.printUniversity();
        System.out.println();
        asem.printUniversity();
        System.out.println();
        ulim.printUniversity();

    }

}
