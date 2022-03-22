package week7.java;
// Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Program17 {
    public static void main(String[] args) {
        Program17 a = new Program17();
        a.getArray();
    }

    public void getArray(){

        int [] array1 = {36,32,4,40,8,12,28,16,20,24};
        String[] array2 = {"zebra","cat","dog","unicorn","cow","fox","monkey","meerkat"};

        System.out.println("Original numeric array1: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array1: " + Arrays.toString(array1));

        System.out.println("Original string array2: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array2: " + Arrays.toString(array2));
    }
}
