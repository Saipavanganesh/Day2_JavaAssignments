package com.assignments.Day2;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Month number");
        int m=sc.nextInt();
        System.out.println("Enter Day number");
        int d=sc.nextInt();

        if(m>=3 && m<=6 && d<=20){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
