/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the ceiling? ");
        int length = parseInt(input.nextLine());

        System.out.print("What is the width of the ceiling? ");
        int width = parseInt(input.nextLine());

        int ceiling_area = length * width;
        final double conversion = 350;
        double exact_gallons = (double)ceiling_area / conversion;
        int final_gallons = (int)Math.ceil(exact_gallons);

        System.out.println("You will need to purchase " + final_gallons + " gallons of paint to cover " + ceiling_area + " square feet.");
    }
}
