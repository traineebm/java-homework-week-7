package week7.java;
// Write a Java program to test if an array contains a specific value.
public class Program20 {
    public static void main(String[] args) {
        Program20.array();
    }


    public static void array(){
        int[] numbers = {1, 2, 3, 4, 5};
        int toFind = 3;
        boolean found = false;

        // Using for loop
        for (int n : numbers) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found){
            System.out.println(toFind + " is found");
        } else System.out.println(toFind + " is not found");
    }
}
