package week7.java;
// Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        leapYear();     // Declaring static method in main method
    }
    // Declaring static method
    public static void leapYear(){
        int year;
        System.out.print("Enter any year: ");
        Scanner s = new Scanner(System.in);
        year = s.nextInt();

        //Using if else condition
        if(((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)){
            System.out.println(year + " - Specified year is a leap year");
        } else {
            System.out.println(year + " - Specified year is not a leap year");
        }

    }
}
