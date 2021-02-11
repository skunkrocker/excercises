package org.machinehead.sum;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfNumbersInArray {

    public static int[] sumOfNumbersInArrayV3(int[] arrayOfInt, int sum) {
        final Integer[] integers = Arrays.stream(arrayOfInt)
                .boxed()
                .sorted()
                .collect(Collectors.toList())
                .toArray(new Integer[arrayOfInt.length]);

        final Integer firstInArray = integers[0];
        final Integer lastInArray  = integers[integers.length - 1];

        //check if in range before computing
        if (sum > firstInArray * 2 || sum < lastInArray * 2) {
            return findSumForNumbersInArray(sum, integers);
        }
        return null;
    }

    public static int[] sumOfNumbersInArrayV2(int[] arrayOfInt, int sum) {
        final Integer[] integers = Arrays.stream(arrayOfInt)
                .boxed()
                .sorted()
                .collect(Collectors.toList())
                .toArray(new Integer[arrayOfInt.length]);

        return findSumForNumbersInArray(sum, integers);
    }

    public static int[] sumOfTwoNumbersInArrayV1(int[] arrayOfInt, int sum) {

        for (int first : arrayOfInt) {
            for (int second : arrayOfInt) {
                if (first + second == sum) {
                    return new int[]{first, second};
                }
            }
        }
        return null;
    }

    private static int[] findSumForNumbersInArray(final int sum, final Integer[] inIntegers) {
        for (int x = inIntegers.length - 1; x >= 0; x--) {
            int xNum = inIntegers[x];
            for (int yNum : inIntegers) {
                if (xNum + yNum == sum) {
                    return new int[]{xNum, yNum};
                }
                if (xNum + yNum < sum) {
                    continue;
                }
                if (xNum + yNum > sum) {
                    break;
                }
            }
        }

        return null;
    }

    private SumOfNumbersInArray() {
        //prevent instantiation
    }
}
