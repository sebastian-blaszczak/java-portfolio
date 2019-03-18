package recursion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FibonacciCollector {

    /**
     * This static method collect all fibonacci numbers from 0 to n
     * @param n index of last fibonacci number
     * @return list of Fibonacci sequence
     */
    static List<Integer> collect(int n) {

        return Stream.iterate(0, x -> x + 1)
                .limit(n + 1)
                .map(x -> fibonacci(x))
                .collect(Collectors.toList());

    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
