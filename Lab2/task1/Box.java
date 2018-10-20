package com.nicu.Lab2.task1;

public class Box {
        float  height=1;
        float  width=1;
        float  depth=1;
    float area;
    float volum;


    public Box (float height, float width, float depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

public Box(float x){
        this.height=x;
        this.width=x;
        this.depth=x;
}
public Box(){}

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getDepth() {
        return depth;
    }
    public float areas()
    {
        area=2*height*width +2*width*depth+2*height*depth;
        return area;
    }
    public float volums(){
        volum= height*width*depth;
        return volum;
    }
}
