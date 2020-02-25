import strings.PalindromeString;

import static utils.KeyboardReader.getReadFromKeyboard;

public class Main {

    public static void main(String[] args) {

        PalindromeString palindromeString = new PalindromeString();
        palindromeString.isPalindrome(getReadFromKeyboard("Enter a word to check palindrome: "));
    }

}

