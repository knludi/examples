package strings;

import java.text.Normalizer;

public class PalindromeString {

    private boolean isPalindrome = false;
    private String sentence;

    public PalindromeString() {
    }

    public String getResult(String sentence) {
        this.sentence = normalize(sentence);

        if (isPalindrome()) {
            return  "\"" + sentence + "\"" + " is a palindrome!";
        }

        return  "\"" + sentence + "\"" + " is not a palindrome!";
    }

    private boolean isPalindrome() {

        String reversedWord = new StringBuilder(sentence).reverse().toString();

        if (sentence.equals(reversedWord)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    private String normalize(String string) {
        String pattern = "(?i)[^0-9a-záéíóúàèìòùâêîôûãõç\\\\s]";
        return Normalizer
                .normalize(string, Normalizer.Form.NFD)
                .toUpperCase()
                .replaceAll(pattern,"");
    }
}

