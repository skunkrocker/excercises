package org.machinehead.sum;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfNumbersInArrayTest {

    private final int[] array = {1, 4, 6, 7, 9, 10, 11, 12, 14, 17, 20, 21};

    @Test
    void sumOfNumbersInArrayV1_SumExists_ItsFound() {
        final int expectedSum = 15;

        final int[] result = computeAndPrintTime("V1 ist Found", () -> SumOfNumbersInArray.sumOfTwoNumbersInArrayV1(array, expectedSum));

        assertThat(result).isNotNull();
        assertThat(result.length).isEqualTo(2);
        assertThat(result[0] + result[1]).isEqualTo(expectedSum);
    }

    @Test
    void sumOfNumbersInArrayV1_SumDoesNotExists_ReturnNull_UpperEdge() {
        final int expectedSum = 100;

        final int[] result = computeAndPrintTime("V1 Upper Edge", () -> SumOfNumbersInArray.sumOfTwoNumbersInArrayV1(array, expectedSum));

        assertThat(result).isNull();
    }

    @Test
    void sumOfNumbersInArrayV1_SumDoesNotExists_ReturnNull_LowerEdge() {
        final int expectedSum = 0;

        final int[] result = computeAndPrintTime("V1 Lowe Edge", () -> SumOfNumbersInArray.sumOfTwoNumbersInArrayV1(array, expectedSum));

        assertThat(result).isNull();
    }

    @Test
    void sumOfNumbersInArrayV2_SumExists_ItsFound() {
        final int expectedSum = 15;

        final int[] result = computeAndPrintTime("V2 is Found", () -> SumOfNumbersInArray.sumOfNumbersInArrayV2(array, expectedSum));

        assertThat(result).isNotNull();
        assertThat(result.length).isEqualTo(2);
        assertThat(result[0] + result[1]).isEqualTo(expectedSum);
    }


    @Test
    void sumOfNumbersInArrayV2_SumDoesNotExists_ReturnNull_LowerEdge() {
        final int expectedSum = 0;

        final int[] result = computeAndPrintTime("V2 Lower Edge", () -> SumOfNumbersInArray.sumOfNumbersInArrayV2(array, expectedSum));

        assertThat(result).isNull();
    }

    @Test
    void sumOfNumbersInArrayV2_SumDoesNotExists_ReturnNull_UpperEdge() {
        final int expectedSum = 100;

        final int[] result = computeAndPrintTime("V2 Upper Edge", () -> SumOfNumbersInArray.sumOfNumbersInArrayV2(array, expectedSum));

        assertThat(result).isNull();
    }


    @Test
    void sumOfNumbersInArrayV3_SumExists_ItsFound() {
        final int expectedSum = 15;

        final int[] result = computeAndPrintTime("V3 is Found", () -> SumOfNumbersInArray.sumOfNumbersInArrayV3(array, expectedSum));

        assertThat(result).isNotNull();
        assertThat(result.length).isEqualTo(2);
        assertThat(result[0] + result[1]).isEqualTo(expectedSum);
    }


    @Test
    void sumOfNumbersInArrayV3_SumDoesNotExists_ReturnNull_LowerEdge() {
        final int expectedSum = 0;

        final int[] result = computeAndPrintTime("V3 Lower Edge", () -> SumOfNumbersInArray.sumOfNumbersInArrayV3(array, expectedSum));

        assertThat(result).isNull();
    }

    @Test
    void sumOfNumbersInArrayV3_SumDoesNotExists_ReturnNull_UpperEdge() {
        final int expectedSum = 100;

        final int[] result = computeAndPrintTime("V3 Upper Edge", () -> SumOfNumbersInArray.sumOfNumbersInArrayV3(array, expectedSum));

        assertThat(result).isNull();
    }

    private int[] computeAndPrintTime(String version, Supplier<int[]> inSupplier) {
        System.out.println("-------------------   Sum of two number in same array " + version + " -------------------");

        long        start  = System.currentTimeMillis();
        final int[] result = inSupplier.get();
        long        end    = System.currentTimeMillis();

        long millis = end - start;
        System.err.println("finished in: " + millis + "ms");

        return result;
    }
}