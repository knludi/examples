package strings;

public class PalindromeString {

    private boolean isPalindrome = false;
    private String sentence;

    public PalindromeString() {
    }

    public boolean isPalindrome(String sentence) {
        this.sentence = sentence;

        String reversedWord = new StringBuilder(sentence).reverse().toString();

        if (sentence.equals(reversedWord)) {
            isPalindrome = true;
        }

        return isPalindrome;
    }

    public String getMessageResult() {

        if (isPalindrome = true) {
            return  "\"" + sentence + "\"" + " is a palindrome!";
        }

        return "";
    }
}

