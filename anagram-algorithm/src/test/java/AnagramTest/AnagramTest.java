package AnagramTest;

import AnagramSolver.AnagramAlgorithm;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for Anagram algorithm
 */
public class AnagramTest {

    @Test
    public void anagramTestShouldReturnBooleanArray() {
        String[] words1 = new String[]{"more", "snail", "atom"};
        String[] words2 = new String[]{"rome", "nails", "bomb"};
        Assertions.assertThat(AnagramAlgorithm.solve(words1, words2))
                .isEqualTo(Arrays.asList(true, true, false));
    }

    @Test
    public void anagramTestShouldThrowIllegalArgumentException() {
        String[] words1 = new String[]{"more", "snail"};
        String[] words2 = new String[]{"rome", "nails", "bomb"};
        Assertions.assertThat(AnagramAlgorithm.solve(words1, words2))
                .isEqualTo(Arrays.asList(true, true, false));
    }
}