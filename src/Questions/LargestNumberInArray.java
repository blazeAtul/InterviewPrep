package Questions;

import java.util.Arrays;

/*
Write a Java Program to Find the Largest Element in Array
    Input: [ 7, 2, 5, 1, 4]
    Output: 7
 */
public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 4, 12, 0};
        largestNumberUsingFor(arr);
    }

    public static void largestNumberUsingStream(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else {
            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println("Largest number in an array is " + max);
            int min = Arrays.stream(arr).min().getAsInt();
            System.out.println("Smallest number in an array is " + min);
        }
    }

    public static void largestNumberUsingFor(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void smallestNumberUsingFor(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}