package AnagramSolver;

import java.util.*;

public class AnagramAlgorithm {

    /**
     * @param words1 Strings array
     * @param words2 Strings array
     * @return list of booleans that shows if the comparing words are anagrams
     */

    public static List<Boolean> solve(String[] words1, String[] words2) {

        if(words1.length != words2.length){
            throw new IllegalArgumentException("Arrays must have the same length!");
        }

        List<String> wordsToList1 = new ArrayList<>(Arrays.asList(words1));
        List<String> wordsToList2 = new ArrayList<>(Arrays.asList(words2));

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < wordsToList1.size(); i++) {
            result.add(isAnagram(wordsToList1.get(i), wordsToList2.get(i)));
        }

        return result;
    }

    private static boolean isAnagram(String word1, String word2) {
        char[] wordToChar1 = word1.toCharArray();
        char[] wordToChar2 = word2.toCharArray();
        Arrays.sort(wordToChar1);
        Arrays.sort(wordToChar2);
        return Arrays.equals(wordToChar1, wordToChar2);
    }
}
