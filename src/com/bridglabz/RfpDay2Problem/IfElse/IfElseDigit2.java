package com.bridglabz.RfpDay2Problem.IfElse;

import java.util.Scanner;

public class IfElseDigit2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1){
            System.out.println("One");
        } else if (num==10) {
            System.out.println("Ten");
        } else if (num==100) {
            System.out.println("Hundred");
        } else if (num==1000) {
            System.out.println("ten hundred");
        }
    }
}
