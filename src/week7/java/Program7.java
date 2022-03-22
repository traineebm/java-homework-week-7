package week7.java;
/**Write a java program input sales id, seller's name, sales amount, and salary basic
 *and then fined this sales:
 *Commission
 *Sales amount >= 50,000 35%
 *Sales amount >= 30,000 20%
 *>= 20,000 10%
 *>= 10,000 5%
 *< 10,000 2%
*/

 import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Program7 obj = new Program7();  // creating object
        obj.sellerDetails();          // calling instance method via object reference
    }

    public void sellerDetails(){  //Declaring instance method
        int salesId;
        String sellerName;
        int amount;
        double salarybasic;
        double salesCommission;

        System.out.print("Enter sales Id:  ");
        Scanner a = new Scanner(System.in);
        salesId = a.nextInt();

        System.out.print("Enter seller name: ");
        Scanner b = new Scanner(System.in);
        sellerName = b.nextLine();

        System.out.print("Enter sales amount: ");
        Scanner c = new Scanner(System.in);
        amount = c.nextInt();

        System.out.print("Enter basic salary: ");
        Scanner d = new Scanner(System.in);
        salarybasic = d.nextDouble();

        if (amount >= 50000) { // if statement to calculate commission
            System.out.print("Sales commission is = " + (amount * 0.35));

        } else if (amount >= 30000){
            System.out.print("Sales commission is = " + (amount * 0.20));

        } else if (amount >=10000){
            System.out.print("Sales commission is = " + (amount * 0.05));

        } else if (amount < 10000){
            System.out.print("Sales commission is = " + (amount * 0.02));
        } else{
            System.out.print("Please input valid value");
        }
    }
}