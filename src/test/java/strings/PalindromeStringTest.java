package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PalindromeStringTest {
    private static final String PALINDROME_WORD = "ANA";
    private static final String NOT_PALINDROME_WORD = "LUDMILA";
    private static final String PALINDROME_SENTENCE = "A base do teto desaba.";
    private static final String NOT_PALINDROME_SENTENCE = "A base do teto desabou.";


    private PalindromeString palindromeString;

    @BeforeEach
    void setUp() {
        palindromeString = new PalindromeString();
    }

    @Test
    void aWordIsAPalindrome() {
        assertThat(palindromeString.getResult(PALINDROME_WORD))
                .isEqualTo("\"" + PALINDROME_WORD + "\"" + " is a palindrome!");

    }

    @Test
    void aWordIsNotAPalindrome() {
        assertThat(palindromeString.getResult(NOT_PALINDROME_WORD))
                .isEqualTo("\"" + NOT_PALINDROME_WORD + "\"" + " is not a palindrome!");

    }

    @Test
    void aSentenceIsAPalindrome() {
        assertThat(palindromeString.getResult(PALINDROME_SENTENCE))
                .isEqualTo("\"" + PALINDROME_SENTENCE + "\"" + " is a palindrome!");

    }

    @Test
    void aSentenceIsNotAPalindrome() {
        assertThat(palindromeString.getResult(NOT_PALINDROME_SENTENCE))
                .isEqualTo("\"" + NOT_PALINDROME_SENTENCE + "\"" + " is not a palindrome!");

    }
}
