package com.bridglabz.RfpDay2Problem.WhileLoop;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            sum=sum+i;

            i++;
        }
        System.out.println( "Sum of natural number is: "+sum);
    }
}
