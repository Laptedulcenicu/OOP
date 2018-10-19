package com.nicu.Lab4.Bonus;

import com.nicu.Lab4.task1.createfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Main {


    public static void main(String[] args) {
        createfile g= new createfile();
        String line="";
        String textline1 = "";
        String textline2 = "";
        String textline3 = "";

        try {
            FileReader f = new FileReader("three_expression.txt");
            LineNumberReader reader = new LineNumberReader(f);
            String currentLine = null;
            String textLine1 = null;
            String textLine2 = null;
            String textLine3 = null;
            while ((currentLine = reader.readLine()) != null) {
                if (reader.getLineNumber() == 1) {
                    textLine1 = currentLine;
                    textline1=textLine1;
                }
                if (reader.getLineNumber() == 2) {
                    textLine2 = currentLine;
                    textline2=textLine2;
                }
                if (reader.getLineNumber() == 3) {
                    textLine3 = currentLine;
                    textline3=textLine3;
                }
            }
        }

        catch (IOException e)
        {
            System.out.println("error");
        }

        System.out.println("Firstline is : " +textline1);
        if(g.AreParanthesesBalanced(textline1))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        System.out.println("Secondline is : " +textline2);
        if(g.AreParanthesesBalanced(textline2))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
        System.out.println("Thirdline is : " +textline3 );

            if(g.AreParanthesesBalanced(textline3))
                System.out.println("Balanced");
            else
        System.out.println("Not Balanced");




}
}
