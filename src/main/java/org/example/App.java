package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        double order, tax = 0;
        String state;
        System.out.println("What is the order amount?");
        Scanner input = new Scanner(System.in);
        //order = input.nextDouble();
        order = Double.parseDouble(input.nextLine());
        System.out.println("What is the state?");
        state = input.nextLine();
        if ("WI".equals(state))
        {
            tax = order * 0.055;
            System.out.println("The tax is $" + tax);
        }
        System.out.println("The total is $" + (order + tax));
    }
}