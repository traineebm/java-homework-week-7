package week7.java;
// Write a java program to input any number and find out if it’s odd or even
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // Using scanner method
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        // Declaring if -else condition
        if (num % 2 == 0){
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}

