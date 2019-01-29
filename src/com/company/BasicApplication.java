package com.company;

import java.util.Scanner;

public class BasicApplication {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Keyboard.nextInt();
        int num1= num+5;
        int num2= num1*2;
        int num3= num2-7;
        System.out.println(num3);

    }

}