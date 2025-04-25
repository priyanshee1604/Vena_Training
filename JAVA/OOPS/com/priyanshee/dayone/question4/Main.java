package com.priyanshee.dayone.question4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Shape() ;
        shapes[1] = new Circle() ;
        shapes[2] = new Triangle() ;
        shapes[3] = new Square() ;

        for(int i = 0; i < 4; i++) {
            shapes[i].draw();
        }
    }
}
