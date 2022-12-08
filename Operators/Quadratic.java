package com.assignments;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        System.out.println("Enter c value");
        int c=sc.nextInt();
        float delta,root1,root2;
        delta=(b*b)-(4*a*c);
        root1=(-b+delta)/(2*a);
        root2=(-b-delta)/(2*a);
        System.out.println("The two roots are "+root1 +root2);
    }
}
