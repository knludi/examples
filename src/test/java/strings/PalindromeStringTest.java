package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PalindromeStringTest {
    private static final String PALINDROME_WORD = "ANA";
    private PalindromeString palindromeString;

    @BeforeEach
    void setUp() {
        palindromeString = new PalindromeString();
    }


    @Test
    void isPalindromeWord() {

        assertThat(palindromeString.isPalindrome(PALINDROME_WORD)).isTrue();
        assertThat(palindromeString.getMessageResult()).isEqualTo("\"" + PALINDROME_WORD + "\"" + " is a palindrome!");

    }
}
