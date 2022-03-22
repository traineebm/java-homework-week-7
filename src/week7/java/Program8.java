package week7.java;
// Input any alphabet from “A" to “F” and print their city name accordingly
// (use if else) if any other alphabet should be invalid entry
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Program8.cNames();
    }

    public static void cNames(){
        String alphabet;
        System.out.print("Enter the alphabet from A to F: ");

        Scanner city = new Scanner(System.in);
        alphabet = city.nextLine();

        if (alphabet.equals("A")) {
            System.out.println("City name is Allahabad");
        } else if (alphabet.equals("B")) {
            System.out.println("City name is Baroda");
        } else if (alphabet.equals("C")) {
            System.out.println("City name is Chandigarh");
        } else if (alphabet.equals("D")) {
            System.out.println("City name is Dheradun");
        } else if (alphabet.equals("E")) {
            System.out.println("City name is Exeter");
        } else if (alphabet.equals("F")) {
            System.out.println("City name is Florida");
        } else {
            System.out.println("Invalid city name");
        }
    }

}
