package recursion;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FactorialCollector {

    /**
     * This static method collect all factorial numbers from 0 to n
     * @param n index of factorial number
     * @return list of factorial sequence
     */
    static List<BigInteger> collect(int n) {

        return Stream.iterate(0, x -> x + 1)
                .limit(n + 1)
                .map(x -> factorial(BigInteger.valueOf(x)))
                .collect(Collectors.toList());
    }

    private static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return factorial(n.subtract(BigInteger.ONE)).multiply(n);
        }
    }
}
