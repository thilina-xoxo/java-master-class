package NeetCode.ArraysHashing;
import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {

       String[] input = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagram(input));

    }

    public static List<List<String>> groupAnagram(String[] arg) {
        Map<String,List<String>> anagramMap = new HashMap<>();

        for (String word: arg) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if(!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<String>());
            }
            anagramMap.get(sortedWord).add(word);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
