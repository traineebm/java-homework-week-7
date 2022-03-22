package week7.java;
// Write a Java program to calculate the average value of array elements.
public class Program19 {
    public static void main(String[] args) {
        Program19.getSum();
    }

    public static void getSum() {

    int[] num = new int[]{20, 30, 40, 50, 60, 80, 100};
        //Calculate the sum of arrays
        int sum = 0;

        // using for loop
        for(int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }
        //Calculate the average value of array
        double avg = sum / num.length;
        System.out.print("Average value of the array: " + avg);


    }
}
