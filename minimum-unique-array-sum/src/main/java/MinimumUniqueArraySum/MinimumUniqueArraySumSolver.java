package MinimumUniqueArraySum;


import java.util.Arrays;

public class MinimumUniqueArraySumSolver {

    public static int solve(int[] integers) {
        Arrays.sort(integers);

        int previous = 0;
        for (int i = 0; i < integers.length; i++) {
            if (previous != 0 && previous >= integers[i]) {
                integers[i] = previous + 1;
            }
            previous = integers[i];
        }

        return Arrays.stream(integers).sum();
    }
}
