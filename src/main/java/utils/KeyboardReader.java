package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  KeyboardReader {

    public static String getReadFromKeyboard(String displayMessage) throws IOException {

        System.out.println(displayMessage);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        return bufferedReader.readLine();
    }
}
