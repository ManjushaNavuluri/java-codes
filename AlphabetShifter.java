package examplesPrograms;
import java.util.*;
public class AlphabetShifter {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input =sc.nextLine();
        String output = shiftAlphabets(input);
        System.out.println(output);
    }

    public static String shiftAlphabets(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");

        for (String word : words) {
            result.append(shiftWord(word)).append(" ");
        }

        return result.toString().trim();
    }

    private static String shiftWord(String word) {
        StringBuilder shiftedWord = new StringBuilder();
        int shift = word.length();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                shiftedWord.append(shiftChar(c, shift));
            } else {
                shiftedWord.append(c);
            }
        }

        return shiftedWord.toString();
    }

    private static char shiftChar(char c, int shift) {
        if (Character.isUpperCase(c)) {
            return (char) ((c - 'A' + shift) % 26 + 'A');
        } else if (Character.isLowerCase(c)) {
            return (char) ((c - 'a' + shift) % 26 + 'a');
        }
        return c;
    }
}
