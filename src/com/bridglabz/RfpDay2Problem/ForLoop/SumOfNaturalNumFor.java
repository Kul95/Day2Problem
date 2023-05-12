package com.bridglabz.RfpDay2Problem.ForLoop;

import java.util.Scanner;

public class SumOfNaturalNumFor {
    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;

        }
        System.out.println( "Sum of number is: "+sum);
    }
}
