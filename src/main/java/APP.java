/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        System.out.println("What is the principal amount? ");
        Scanner sc = new Scanner(System.in);
        String Principal = sc.nextLine();
        System.out.println("What is the rate?  ");
        String IterestRate = sc.nextLine();
        System.out.println("What is the number of years? ");
        String Years = sc.nextLine();
        System.out.println("What is the number of times the interest is compounded per year? ");
        String CoumpoundYears = sc.nextLine();

        double PrincipalDouble = Double.parseDouble(Principal);
        double IterestRateDouble = (Double.parseDouble(IterestRate)/ 100.0);
        int YearsInt = Integer.parseInt(Years);
        double CoumpoundYearsDouble = Double.parseDouble(CoumpoundYears);

        double EndAmount =  PrincipalDouble * Math.pow(1 + (IterestRateDouble / CoumpoundYearsDouble),  YearsInt * CoumpoundYearsDouble);
        double EndAmountPenny = Math.round(EndAmount * 100.0) / 100.0;
        System.out.println("$"+ (int) PrincipalDouble + " invested at " +  (IterestRateDouble* 100) + "% for " + YearsInt + " years compounded " + (int) CoumpoundYearsDouble +" times per year is $"+ EndAmountPenny);




    }
}
