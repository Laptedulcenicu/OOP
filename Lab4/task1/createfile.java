package com.nicu.Lab4.task1;
import java.io.*;
import java.util.*;
import java.lang.*;

public class createfile {

 public   boolean ArePair(char opening,char closing)
    {
        if(opening == '(' && closing == ')') return true;
        else if(opening == '{' && closing == '}') return true;
        else if(opening == '[' && closing == ']') return true;
        return false;
    }
  public  boolean AreParanthesesBalanced(String exp)
    {


        Stack<String> Sc = new Stack<>();
        for(int i =0;i<exp.length(); i++)
        {
            if(exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[')
                Sc.push(String.valueOf(exp.charAt(i)));

            else if(exp.charAt(i) == ')' || exp.charAt(i) == '}' ||exp.charAt(i) == ']')
            {
                if(Sc.empty() || !ArePair(Sc.peek().charAt(0),exp.charAt(i)))
                    return false;
                else
                    Sc.pop();
            }
        }
        return Sc.empty() ? true:false;
    }
}
