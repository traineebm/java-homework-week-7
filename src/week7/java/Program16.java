package week7.java;
// Write the java program to check if the entered number is "POSITIVE", "NEGATIVE" or "ZERO"

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Program16 in = new Program16();
        in.integer();
    }


    public void integer(){
        int number;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = s.nextInt();

        if (number>0){
            System.out.print(number + " is a POSITIVE number");
        } else if (number<0){
            System.out.print(number + " is a NEGATIVE number");
        } else{
            System.out.print(number + " it is ZERO");
        }
    }
}
