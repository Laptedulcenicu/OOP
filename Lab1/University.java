package com.nicu.Lab1;

public class University {
    String name;
    int foundationYear;
    Student[] lista;
    Student s;
    float avg;

    public void printUniversity() {
        System.out.println("University name :" + name);
        System.out.println("Foundation year :" + foundationYear);
        float sum=0;
        for(Student s: lista ){
            s.printStudent();
            sum+=s.mark;
        }

        avg = sum/lista.length;
        System.out.println("Media este: " + avg);
    }
}
