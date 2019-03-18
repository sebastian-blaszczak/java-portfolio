package recursion;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for FibonacciCollector.
 */
public class FibonacciCollectorTest {

    private List<Integer> resultFor19;
    private List<Integer> resultFor9;
    private List<Integer> resultFor1;

    @Before
    public void setUpTest() {
        resultFor19 = Arrays.asList(
                0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
        );
        resultFor9 = Arrays.asList(
                0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        resultFor1 = Arrays.asList(
                0, 1);
    }

    @Test
    public void fibonacciCollectorTest() {
        Assertions.assertThat(FibonacciCollector.collect(19)).isEqualTo(resultFor19);
        Assertions.assertThat(FibonacciCollector.collect(9)).isEqualTo(resultFor9);
        Assertions.assertThat(FibonacciCollector.collect(1)).isEqualTo(resultFor1);
    }
}
