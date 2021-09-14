/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter the principal:");
        double principal = input.nextDouble();

        System.out.println("Enter the rate of interest as a percentage (without the % sign):");
        double interestRate = input.nextDouble();

        System.out.println("Enter the number of years: ");
        double numYears = input.nextDouble();

        //calculations
        double interestRateDecimal = interestRate/100;
        double finalAmount = principal * (1 + (interestRateDecimal * numYears));

        //output
        System.out.println(String.format("After %.2f years at %.2f%%, the investment will be worth $%.2f.", numYears, interestRate, finalAmount));

    }
}
