package week7.java;
// Write a Java program to sum values of an array.

public class Program18 {
    public static void main(String[] args) {
        Program18.calculation();
    }

    public static void calculation(){
        //Initialise an array
        int [] a = new int[]{10,20,25,30,35};
        int sum = 0;

        //using for loop to calculate the sum of arrays
        for (int i = 0; i <a.length; i++){
            sum = sum+a[i];
        }
        System.out.println("Sum values of an array: "+ sum);
    }
}
