package AnagramSolver;

import java.util.*;

public class AnagramAlgorithm {

    /**
     * @param words1 Strings array
     * @param words2 Strings array
     * @return list of booleans that shows if the comparing words are anagrams
     */

    public List<Boolean> solve(String[] words1, String[] words2) {

        List<String> wordsToList1 = new ArrayList<>(Arrays.asList(words1));
        List<String> wordsToList2 = new ArrayList<>(Arrays.asList(words2));

        wordsToList1.forEach(this::sort);
        wordsToList2.forEach(this::sort);

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < wordsToList1.size(); i++) {
            result.add(isAnagram(wordsToList1.get(i), wordsToList2.get(i)));
        }

        return result;
    }

    private String sort(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private boolean isAnagram(String word1, String word2) {
        char[] wordToChar1 = word1.replaceAll("[\\s]", "").toCharArray();
        char[] wordToChar2 = word2.replaceAll("[\\s]", "").toCharArray();
        return Arrays.equals(wordToChar1, wordToChar2);
    }
}
