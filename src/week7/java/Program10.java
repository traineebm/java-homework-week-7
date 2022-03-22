package week7.java;
/* Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
*/
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Program10.result();
    }


    public static void result(){
        Scanner m = new Scanner(System.in);
        float num1, num2, res;
        char ch;

        System.out.println("Enter any Two Numbers: ");
        num1 = m.nextFloat();
        num2 = m.nextFloat();

        System.out.println("Enter the Operator (+, -, *, /): ");
        ch = m.next().charAt(0);
        if(ch == '+') res = num1 + num2;
        else if(ch == '-') res = num1 - num2;
        else if(ch == '*') res = num1 * num2;
        else if(ch == '/') res = num1 / num2;
        else{
            System.out.println("\nInvalid Input");
            return;
        }
        System.out.println("\nResult =" + res);


    }
}
