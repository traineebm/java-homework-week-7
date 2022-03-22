package week7.java;
// Write a java program that tells us that Input number is odd or even? HINT: use ternary operator (? :)
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Program1 obj = new Program1();  // Declaring object
        obj.nubmer();                  // Declaring instance method in main method
    }
    public void nubmer(){            // No return type no parameters with instance method
        int number;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        number =sc.nextInt();

        String result = (number % 2== 0)? "even" : "odd";
        System.out.println(number + " is " + result + " number");

    }
}
