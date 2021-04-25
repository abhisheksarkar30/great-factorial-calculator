package edu.abhi.tool.greatfactorial;

import java.util.Scanner;

public class ArrayFactorial {
    /* This algorithm
     * Works much Faster
     */
    public static void main(String args[]) {
        int maxDigits = 1_00_00_000;
        int result[] = new int[maxDigits];
        Scanner sc = new Scanner(System.in);

        result[maxDigits - 1] = 1;
        for(int index = 0; index < maxDigits - 1; index++)
            result[index] = - 9;

        System.out.print("Enter a number: ");
        int input = sc.nextInt(), resultIndex = maxDigits - 2;

        long start = System.currentTimeMillis();

        for(int currentNumber = 2; currentNumber <= input; currentNumber++) {
            long carry = 0;
            for(resultIndex = maxDigits - 1; result[resultIndex] != -9; resultIndex--, carry /= 10) {
                carry += result[resultIndex] * currentNumber;
                result[resultIndex] = (int) (carry % 10);
            }
            for(; carry > 0; resultIndex--, carry /= 10)
                result[resultIndex] = (int)(carry % 10);
        }

        long diff = System.currentTimeMillis() - start;
        System.out.println(String.format("Calculation Time: %d Minute(s) %f Second(s)", diff / 60000, diff % 60000 / 1000.0));

        if(input > 10)
            System.out.println(String.format("%d.%se+%d (TRUNCATED VALUE)", result[resultIndex + 1], "" + result[resultIndex + 2]
                    + result[resultIndex + 3] + result[resultIndex + 4] + result[resultIndex + 5], (maxDigits - 2 - resultIndex)));

        System.out.println(maxDigits - 1 - resultIndex + " Digit(s)");

        for(resultIndex++; resultIndex < maxDigits; resultIndex++)
            System.out.print(result[resultIndex]);
    }
}