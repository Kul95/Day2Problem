package com.bridglabz.RfpDay2Problem.WhileLoop;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse number is: "+rev);
    }
}
