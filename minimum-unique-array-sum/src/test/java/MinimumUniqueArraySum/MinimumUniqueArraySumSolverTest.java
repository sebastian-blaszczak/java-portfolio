package MinimumUniqueArraySum;


import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Minimum Array Sum Solver
 */
class MinimumUniqueArraySumSolverTest {

    private int[] testSet = new int[]{1, 2, 3, 3, 4, 5};
    private int[] testSetAllEquals = new int[]{0, 0, 0, 0, 0};
    private int[] testSetAllNegative = new int[]{-1, -10, -4, -4, -4};
    private int[] testSetNegativeAndPositive = new int[]{1, 1, -1, -3, -3};
    private int[] testSetThatThrowsException = new int[]{};

    @Before
    void settingUpTestSets() {
        testSet = new int[]{1, 2, 3, 3, 4, 5};
        testSetAllEquals = new int[]{0, 0, 0, 0, 0};
        testSetAllNegative = new int[]{-1, -10, -4, -4, -4};
        testSetNegativeAndPositive = new int[]{1, 1, -1, -3, -3};
    }

    @Test
    void minimumUniqueArraySolverTest() {
        Assertions.assertThat(MinimumUniqueArraySumSolver.solve(testSet)).isEqualTo(21);
    }

    @Test
    void minimumUniqueArraySolverAllEqualsTest() {
        Assertions.assertThat(MinimumUniqueArraySumSolver.solve(testSetAllEquals)).isEqualTo(10);
    }

    @Test
    void minimUniqueArraySolverAllNegative() {
        Assertions.assertThat(MinimumUniqueArraySumSolver.solve(testSetAllNegative)).isEqualTo(-20);
    }

    @Test
    void minimumUniqueArraySolverNegativeAndPositive() {
        Assertions.assertThat(MinimumUniqueArraySumSolver.solve(testSetNegativeAndPositive)).isEqualTo(-3);
    }

    @Test
    void minimumUniqueArraySolverThatThrowsException() {
        Assertions.assertThat(MinimumUniqueArraySumSolver.solve(testSetThatThrowsException)).isEqualTo(-3);
    }
}
