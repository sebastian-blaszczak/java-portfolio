package MinimumUniqueArraySum;


import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.Test;


public class MinimumUniqueArraySumSolverTest {

    int[] testSet = new int[]{1, 2, 3, 3, 4, 5};
    int [] testSet2 = new int [] {1,1,1,1,1};

    @Before
    public void setUpTestSet() {
        testSet = new int[]{1, 2, 3, 3, 4, 5};
    }

    @Test
    public void minimumUniqueArraySolverTest() {
        Assertions.assertThat(MinimumUniqueArraySumSolver.solve(testSet)).isEqualTo(21);
        Assertions.assertThat(MinimumUniqueArraySumSolver.solve(testSet2)).isEqualTo(15);
    }
}
