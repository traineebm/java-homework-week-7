package week7.java;
// Write a program that tells us input value is number or an alphabet or symbol.
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Program12.inputValue();
    }

        static char ch;                     // Declaring static variable

    public static void inputValue(){        //Declaring static method
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any char : ");
        ch = obj.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.print("Alphabet is " + ch);

        } else if (ch >= '0' && ch <= '9') {
            System.out.print("Number is " + ch);

        } else {
            System.out.print("Symbol is " + ch);

        }
    }

}
