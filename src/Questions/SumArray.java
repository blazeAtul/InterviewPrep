package Questions;

/*

Java Program to Find Sum of Array Elements
Input : arr[] = {1, 2, 3}
Output : 6
1 + 2 + 3 = 6

Input : arr[] = {15, 12, 13, 10}
Output : 50
15 + 12 + 13 + 10 = 50
 */
public class SumArray {
    public static void main(String[] args) {
        int[] arr ={15,12,13,10};
        sumOfArrays(arr);
    }

    public static void sumOfArrays(int[] arr) {
        int counter = 0;
        int sum = 0;
        while (counter < arr.length) {
            sum += arr[counter];
            counter++;
        }
        System.out.println(sum);
    }
}
