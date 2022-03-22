package week7.java;
// Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.

public class Program11 {
    public static void main(String[] args) {
        Program11.number();
    }

    public static void number(){
        int x;
        System.out.println("Number divisible by 3: ");
        for (x = 1; x <100; x++) {
            if (x % 3 == 0)
                System.out.print(x +" , ");
            }
            System.out.println("Number divisible by 5: ");
            for (x = 1; x <100; x++) {
                if (x % 5 == 0)
                    System.out.print(x + " , ");
                }
            }
        }


