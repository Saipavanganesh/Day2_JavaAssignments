package com.assignments;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a single character");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowel");
                break;
            default :
                System.out.println("Consonant");
                break;
        }

    }
}
