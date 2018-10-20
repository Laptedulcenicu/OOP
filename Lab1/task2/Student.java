package com.nicu.Lab1.task2;

public class Student  {
     String names;
   private  int  age;
 private    float mark;
   public  Student (String names , int age, float mark){
       this.age=age;
       this.mark=mark;
       this.names=names;

     }
     public String getnames() {
         return names;
     }
     public int getage(){
       return age;
     }
     public float getmark(){
       return mark;
     }
     @Override
    public String toString()
     {
         return "nume : "+names+" virsta : "+age+ " nota : " +mark;
     }

}
