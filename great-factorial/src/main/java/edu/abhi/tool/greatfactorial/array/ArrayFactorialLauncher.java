package edu.abhi.tool.greatfactorial.array;

import java.util.Scanner;

public class ArrayFactorialLauncher {

    /* This algorithm
     * Works much Faster
     */
    public static void main(String args[]) {
        int maxDigits = 1_00_00_000;
        ArrayFactorialCalculator calc = new ArrayFactorialCalculator(maxDigits);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        long start = System.currentTimeMillis();

        int resultIndex = calc.calculate(2, input);

        long diff = System.currentTimeMillis() - start;
        System.out.println(String.format("Calculation Time: %d Minute(s) %f Second(s)", diff / 60000, diff % 60000 / 1000.0));

        int result[] = calc.getResult();

        if(input > 10)
            System.out.println(String.format("%d.%se+%d (TRUNCATED VALUE)", result[resultIndex], "" + result[resultIndex + 1]
                    + result[resultIndex + 2] + result[resultIndex + 3] + result[resultIndex + 4], (maxDigits - 1 - resultIndex)));

        System.out.println(maxDigits - resultIndex + " Digit(s)");

        for(; resultIndex < maxDigits; resultIndex++)
            System.out.print(result[resultIndex]);
    }

}
