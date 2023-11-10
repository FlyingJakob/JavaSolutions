package org.Lektion_10_11_2023;

public class Box {

    public int height;
    public int width;
    public int depth;

    public Box(int side){
        height = side;
        width = side;
        depth = side;
    }



    public Box(int side,int height){
        width = side;
        depth = side;
        this.height = height;
    }

    public Box(int height,int width,int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }



}
