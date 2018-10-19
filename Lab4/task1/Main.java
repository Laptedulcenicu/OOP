package com.nicu.Lab4.task1;

import com.nicu.Lab4.task1.createfile;

import java.io.*;

public class Main {


    public static void main(String[] args) {
        createfile g= new createfile();

      String text="";
        try {
        FileReader f = new FileReader("one_expresion.txt");
        BufferedReader buffer = new BufferedReader (f);
        String line="";
        while ((line=buffer.readLine() ) !=null)
        { text=line;
            System.out.println(line);}
        buffer.close() ;
        }
        catch (IOException e)
        {
            System.out.println("error");
        }



            if(g.AreParanthesesBalanced(text))
                System.out.println("Balanced");
            else
        System.out.println("Not Balanced");




}
}
