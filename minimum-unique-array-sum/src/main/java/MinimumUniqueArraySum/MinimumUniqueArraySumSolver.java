package MinimumUniqueArraySum;


import java.util.Arrays;

class MinimumUniqueArraySumSolver {

    /**
     * Minimum unique array sum is an array that sum only unique numbers if there are two the same numbers it
     * will add 1 to one of number.
     * @param integers array set to sum
     * @return sum of unique array elements
     */
    static int solve(int[] integers) {
        if (integers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty!");
        }
        Arrays.sort(integers);

        int previous = Integer.MIN_VALUE;
        for (int i = 0; i < integers.length; i++) {
            if (previous >= integers[i]) {
                integers[i] = previous + 1;
            }
            previous = integers[i];
        }

        return Arrays.stream(integers).sum();
    }
}
