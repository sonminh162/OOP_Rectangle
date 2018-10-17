package com.company;

import java.util.Scanner;

class Rectangle{
    public double width = 1;
    public double height = 1;
    public Rectangle(){
    }
    public  Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
}
public class Main {


    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle_1 = new Rectangle(4   ,40);
        System.out.println("--Rectangle 1: Width ="+rectangle_1.width+" Height ="+rectangle_1.height);
        System.out.println("Area:"+rectangle_1.getArea());
        System.out.println("Perimeter:"+rectangle_1.getPerimeter());
        Rectangle rectangle_2 = new Rectangle(3.5,35.9);
        System.out.println("--Rectange 2: Width ="+rectangle_2.width+" Height ="+rectangle_2.height);
        System.out.println("Area:"+rectangle_2.getArea());
        System.out.println("Perimeter:"+rectangle_2.getPerimeter());
    }
}
