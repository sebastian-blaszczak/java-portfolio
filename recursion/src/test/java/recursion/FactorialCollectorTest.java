package recursion;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for FactorialCollector.
 */
public class FactorialCollectorTest {

    private List<BigInteger> resultFor3;
    private List<BigInteger> resultFor7;
    private List<BigInteger> resultFor14;

    @Before
    public void setUpTest() {
        resultFor3 = Arrays.asList(BigInteger.ONE,
                BigInteger.ONE,
                BigInteger.valueOf(2),
                BigInteger.valueOf(6));

        resultFor7 = Arrays.asList(BigInteger.ONE,
                BigInteger.ONE,
                BigInteger.valueOf(2),
                BigInteger.valueOf(6),
                BigInteger.valueOf(24),
                BigInteger.valueOf(120),
                BigInteger.valueOf(720),
                BigInteger.valueOf(5040));

        resultFor14 = Arrays.asList(BigInteger.ONE,
                BigInteger.ONE,
                BigInteger.valueOf(2),
                BigInteger.valueOf(6),
                BigInteger.valueOf(24),
                BigInteger.valueOf(120),
                BigInteger.valueOf(720),
                BigInteger.valueOf(5_040),
                BigInteger.valueOf(40_320),
                BigInteger.valueOf(362_880),
                BigInteger.valueOf(3_628_800),
                BigInteger.valueOf(39_916_800),
                BigInteger.valueOf(479_001_600),
                BigInteger.valueOf(6_227_020_800L),
                BigInteger.valueOf(87_178_291_200L));
    }

    @Test
    public void factorialCollectorTest() {
        Assertions.assertThat(FactorialCollector.collect(3)).isEqualTo(resultFor3);
        Assertions.assertThat(FactorialCollector.collect(7)).isEqualTo(resultFor7);
        Assertions.assertThat(FactorialCollector.collect(14)).isEqualTo(resultFor14);
    }
}
