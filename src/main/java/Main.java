import strings.PalindromeString;

import static utils.KeyboardReader.getReadFromKeyboard;

public class Main {

    public static void main(String[] args) {

        System.out.println(palindromeResult());
    }

    private static String palindromeResult() {
        return new PalindromeString()
                .getResult(getReadFromKeyboard("Enter a sentence to check if it is a palindrome: "));
    }

}

