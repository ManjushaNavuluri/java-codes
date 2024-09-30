package examplesPrograms;
import java.util.*;

public class AlienAttack {
    private static final String VOWELS = "aeiou";

    public static List<String> decode(String word) {
        List<String> result = new ArrayList<>();
        decodeHelper(word, 0, "", result);
        Collections.sort(result);
        return result;
    }

    private static void decodeHelper(String word, int index, String current, List<String> result) {
        if (index == word.length()) {
            result.add(current);
            return;
        }

        for (char vowel : VOWELS.toCharArray()) {
            decodeHelper(word, index + 1, current + vowel, result);
        }

        decodeHelper(word, index + 1, current + word.charAt(index), result);
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the encrypted word: ");
        String word = scanner.nextLine();
        scanner.close();
        List<String> result = decode(word);
        for (String s : result) {
            System.out.print(s+" ");
        }
    }
}