package com.assignments;

import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,i=0;
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("Total sum is "+sum);
    }
}
