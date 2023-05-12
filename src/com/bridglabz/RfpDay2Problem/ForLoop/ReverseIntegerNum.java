package com.bridglabz.RfpDay2Problem.ForLoop;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Scanner;
public class ReverseIntegerNum {
    public static void main(String[] args) {
        System.out.println("Inter the integer numbers:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        for (int i = 0; i < num; i++) {

            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println(rev);
    }
}
