import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isVowel(c)) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
