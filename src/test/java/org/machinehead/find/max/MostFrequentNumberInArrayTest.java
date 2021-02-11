package org.machinehead.find.max;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MostFrequentNumberInArrayTest {
    private final int[] integers = new int[]{1, 3, 1, 3, 2, 1, 4, 5, 9, 9, 9, 9, 8, 8, 8, 8, 8, 8, 8};

    @Test
    public void mostFrequentV1() {

        System.out.println("-------------------   Most frequent V1 -------------------");

        long      start        = System.currentTimeMillis();
        final int mostFrequent = MostFrequentNumberInArray.mostFrequentV1(integers);
        long      end          = System.currentTimeMillis();

        System.err.println("the most frequent number = " + mostFrequent);
        long millis = end - start;

        System.err.println("finished in: " + millis + "ms");
        System.out.println();

        assertThat(mostFrequent).isEqualTo(8);
    }

    @Test
    public void mostFrequentV2() {
        System.out.println("-------------------   Most frequent V2 -------------------");

        long      start        = System.currentTimeMillis();
        final int mostFrequent = MostFrequentNumberInArray.mostFrequentV2(integers);
        long      end          = System.currentTimeMillis();

        System.err.println("the most frequent number = " + mostFrequent);

        long millis = end - start;

        System.err.println("finished in: " + millis + "ms");
        System.out.println();

        assertThat(mostFrequent).isEqualTo(8);
    }
}