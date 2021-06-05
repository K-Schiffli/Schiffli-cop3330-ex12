/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;
import java.lang.Math;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String principal = getData("principal");
        String ROI = getData("rate of interest");
        String years = getData("number of years");
        double principalNum = stringToDouble(principal);
        double ROINum = stringToDouble(ROI);
        double yearsNum = stringToDouble(years);
        double total = calcTotal(principalNum, ROINum, yearsNum);
        printOutput(years, ROI, total);
    }
    public static String getData(String phrase)
    {
        System.out.printf( "Enter the %s: ", phrase);
        return in.nextLine();
    }

    public static double stringToDouble(String number)
    {
        return Double.parseDouble(number);
    }

    public static double calcTotal(double principalNum, double ROINum, double yearsNum)
    {
        ROINum /= 100;
        double total = principalNum * (1+ (ROINum * yearsNum));
        total *= 100;
        total = Math.ceil(total);
        return total / 100;
    }

    public static void printOutput (String years, String ROI, double total)
    {
        String totalStr = Double.toString(total);
        String output = "After " + years + " years at " + ROI + "%, the investment will be worth $";
        System.out.printf ( "%s%.2f", output, total );

    }
}
