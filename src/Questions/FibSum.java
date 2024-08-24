package Questions;

import java.util.ArrayList;

public class FibSum {
    public static void main(String[] args) {
        fibSumEven(11);
    }

    public static void fibSumEven(int n) {
//        Input: n = 4
//        Output: 33
//        N = 4, So here the fibonacci series will be produced from 0th term till 8th term:
//        0, 1, 1, 2, 3, 5, 8, 13, 21
//        Sum of numbers at even indexes = 0 + 1 + 3 + 8 + 21 = 33.
        int first = 0;
        int second = 1;
        int evenSum = 0;
        int oddSum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= n * 2; i++) {
            arr.add(first);
            int sum = first + second;
            second = first;
            first = sum;
        }
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                evenSum += arr.get(i);
            } else {
                oddSum += arr.get(i);
            }
        }
        System.out.println("Sum of numbers at even indexes = " + evenSum);
        System.out.println("Sum of numbers at odd indexes = " + oddSum);
    }
}
