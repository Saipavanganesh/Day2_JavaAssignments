package com.assignments.Day2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class MinMaxOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a value");
        int num1=sc.nextInt();
        System.out.println("Enter b value");
        int num2=sc.nextInt();
        System.out.println("Enter c value");
        int num3=sc.nextInt();

        int a,b,c,d,min,max;
        a=num1+num2*num3;
        b=num3+num1/num2;
        c=num1%num2+num3;
        d=num1*num2+num3;

        System.out.println("a+b*c is: "+a);
        System.out.println("c+a/b is: "+b);
        System.out.println("a%b+c is: "+c);
        System.out.println("a*b+c is: "+d);

        int[] arr=new int[]{a,b,c,d};
        Arrays.sort(arr);
        min=arr[0];
        max=arr[arr.length-1];
        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);
    }
}
