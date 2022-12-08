package com.assignments.Day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,rem,sum=0,temp;
        temp=num;
        for(;num>0;){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
}
