package com.nicu.Lab1.task2;

public class University
{
 private   String name;
  private  int fundationYear;
    University( String name,int fundationYear ){
        this.name=name;
        this.fundationYear=fundationYear;
    }


    public String getname() {
        return name;
    }
    public int getFundationYear(){
        return fundationYear;
    }

    @Override
    public String toString()
    {
        return "University : "+name+" which was created in : "+fundationYear+ " has the following students";
    }
}





