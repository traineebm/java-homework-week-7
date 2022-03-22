package week7.java;
// Input any alphabet from “A" to “F” and print their city name accordingly
// (using switch statement) if any other alphabet should be invalid entry
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        char city;
        System.out.println("Enter Your City Choice : ");
        Scanner c = new Scanner(System.in);//Creating objects of scanner class
        city = c.next().charAt(0);

        switch (city) {
            case 'A':
                System.out.println("city name is Agra  ");
                break;
            case 'B':
                System.out.println("city name is Bhalada");
                break;
            case 'C':
                System.out.println("city name is Canasad ");
                break;
            case 'D':
                System.out.println("city name is Dakor");
                break;
            case 'E':
                System.out.println("city name is Ellenabad");
                break;
            case 'F':
                System.out.println("city name is Faizabad");
                break;
            default:
                System.out.println(" Invalid Entry");

        }
    }


}

