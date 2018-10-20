
package com.nicu.Lab1.task1;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        String color1 = "";
        int dimension1;
        int resolution1;

        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
        Scanner in = new Scanner(System.in);
        System.out.println("introduceti datele monitorului");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);

        color1 = buffer.readLine();
        dimension1 = in.nextInt();
        resolution1 = in.nextInt();
        monitor1.input(color1, dimension1, resolution1);

        System.out.println("introduceti datele monitorului 2");
        color1 = buffer.readLine();
        dimension1 = in.nextInt();
        resolution1 = in.nextInt();
        monitor2.input(color1, dimension1, resolution1);
        monitor2.output();
        monitor1.output();




      if (monitor1.returnarea() > monitor2.returnarea()) {
            System.out.println("Monitor 1 are dimensiune mai mare");
        } else {
            System.out.println("Monitorul 2 are dimensiune mai mare");

        }


    }
}
