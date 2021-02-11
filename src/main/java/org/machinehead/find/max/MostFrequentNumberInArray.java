package org.machinehead.find.max;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberInArray {

    public static int mostFrequentV2(int[] integers) {
        Map<Integer, Integer> numberToFrequency = new HashMap<>();
        for (int number : integers) {
            if (numberToFrequency.containsKey(number)) {
                int newCount = numberToFrequency.get(number) + 1;
                numberToFrequency.put(number, newCount);
                continue;
            }
            numberToFrequency.put(number, 1);
        }
        return numberToFrequency.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().get().getKey();
    }

    public static int mostFrequentV1(int[] integers) {
        Map<Integer, Integer> numberToFrequency = new HashMap<>();

        for (int number : integers) {
            if (numberToFrequency.containsKey(number)) {
                //proceed if already checked
                continue;
            }
            int count = 0;
            for (int toCompare : integers) {
                if (number == toCompare) {
                    ++count;
                }
            }
            numberToFrequency.put(number, count);
        }

        return numberToFrequency.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().get().getKey();
    }

    private MostFrequentNumberInArray() {
        // no instantiation
    }
}
