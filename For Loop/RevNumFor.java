package com.assignments;

import java.util.Scanner;

public class RevNumFor {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,rem,sum=0;
        for(;num>0;){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of number is "+sum);
    }
}
