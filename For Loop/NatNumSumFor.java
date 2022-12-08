package com.assignments;

import java.util.Scanner;

public class NatNumSumFor {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,sum=0;
        for(i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum is "+sum);
    }
}
