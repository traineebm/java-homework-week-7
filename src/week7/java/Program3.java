package week7.java;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
           Program3 obj = new Program3(); // Creating object
           obj.student();                //Calling instance method via object reference
         }

    public void student() {     // Instance method

        int rollno, maths, science, english;  //Local variables
        String name;
        String result = null;
        String grade = null;


        System.out.print("Enter student name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        Scanner sc1 = new Scanner(System.in);
        rollno = sc1.nextInt();

        System.out.print("Enter marks for maths, science, and english: ");
        Scanner sc2 = new Scanner(System.in);
        maths = sc2.nextInt();
        science = sc2.nextInt();
        english = sc2.nextInt();
        int total = maths + science + english;
        float percentage = (total * 100 / 300);

        if (percentage >= 35) {
            result = "pass";
        } else {
            result = "fail";
        }

        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 60 && percentage <= 80) {
            grade = "A";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 50 && percentage <= 60) {
            grade = "B";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 35 && percentage <= 50) {
            grade = "C";
            System.out.println("Grade: " + grade);
        } else {
            grade = "No grade";
        }
        System.out.println("_______________________________________________________________");
        System.out.println("|                       Mark Sheet                            |");
        System.out.println("|_____________________________________________________________|");
        System.out.println("|      Name                         :            " + name + " |");
        System.out.println("|      Roll No:                     :           " + rollno + "|");
        System.out.println("|_____________________________________________________________|");
        System.out.println("|      Subjects                     :              Marks      |");
        System.out.println("|_____________________________________________________________|");
        System.out.println("|      Maths                        :            " + maths + "|");
        System.out.println("|      Science                      :          " + science + "|");
        System.out.println("|      English                      :          " + english + "|");
        System.out.println("|_____________________________________________________________|");
        System.out.println("|      Total                        :          " + total + "  |");
        System.out.println("|_____________________________________________________________|");
        System.out.println("|      Percentage                   :" + total * 100 / 300 + "|");
        System.out.println("|      Result                       :       " + result + "    |");
        System.out.println("|      Grade                        :       " + grade + "     |");
        System.out.println("|_____________________________________________________________|");

    }

}
