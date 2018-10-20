package com.nicu.Lab1.task1;

public class Monitor {
 private    String color;
 private   int dimension;
  private  int resolution;

    public void input(String color1, int dimension1, int resolution1) {
        color = color1;
        dimension = dimension1;
        resolution = resolution1;

    }

    public void output() {
        System.out.println("monitorul cu culoarea " + color + " dimensiunea " + dimension + " rezolutia " + resolution);
    }
        public int returnarea(){
            return dimension;
        }



}
