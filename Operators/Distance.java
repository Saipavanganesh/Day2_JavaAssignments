package com.assignments.Day2;

import java.util.Scanner;
import java.lang.Math;
public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x value");
        double x=sc.nextDouble();
        System.out.println("Enter y value");
        double y=sc.nextDouble();

        double dist=(x*x)+(y*y);
        double distance=Math.sqrt(dist);

        System.out.println("Eucledian Distance is: "+distance);

    }
}
