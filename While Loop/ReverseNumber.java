package com.assignments;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int rem,sum=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num!=0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of the number is "+sum);
    }
}
