package AnagramTest;

import AnagramSolver.AnagramAlgorithm;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for Anagram algorithm
 */
public class AnagramTest {

    String[] words1;
    String[] words2;
    String[] wordsThatThrewException1;
    String[] wordsThatThrewException2;

    @Before
    public void settingUpArrays() {
        words1 = new String[]{"more", "snail", "atom"};
        words2 = new String[]{"rome", "nails", "bomb"};
    }

    @Test
    public void anagramTestShouldReturnBooleanArray() {
        Assertions.assertThat(AnagramAlgorithm.solve(words1, words2))
                .isEqualTo(Arrays.asList(true, true, false));
    }

    @Test
    public void anagramTestShouldThrowIllegalArgumentException() {
        wordsThatThrewException1 = new String[]{"more", "snail"};
        wordsThatThrewException2 = new String[]{"rome", "nails", "bomb"};
        Assertions.assertThat(AnagramAlgorithm.solve(wordsThatThrewException1, wordsThatThrewException2))
                .isEqualTo(Arrays.asList(true, true, false));
    }
}