package examplesPrograms;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Decryptor {
    public static Set<String> decryptWord(String word) {
        Set<String> decryptedWords = new HashSet<>();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        // Generate all possible combinations of vowels for each position in the encrypted word
        for (int i = 0; i < Math.pow(5, word.length()); i++) {
            StringBuilder decryptedWord = new StringBuilder();
            int temp = i;
            
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == 'k') {
                    decryptedWord.append(vowels[temp % 5]);
                    temp /= 5;
                } else {
                    decryptedWord.append(word.charAt(j));
                }
            }
            decryptedWords.add(decryptedWord.toString());
        }
        return decryptedWords;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the encrypted word: ");
        String encryptedWord = scanner.nextLine();
        scanner.close();
        
        Set<String> possibleOriginalWords = decryptWord(encryptedWord);
        System.out.println("Possible original words:");
        for (String word : possibleOriginalWords) {
            System.out.println(word);
        }
    }
}
