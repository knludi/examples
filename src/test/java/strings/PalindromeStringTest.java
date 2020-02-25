package strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PalindromeStringTest {

    @Test
    void palindromeStringIsTrue() {

        PalindromeString palindromeString = new PalindromeString();

        assertThat(palindromeString.getPalindromeResult("ava")).isTrue();

    }
}
