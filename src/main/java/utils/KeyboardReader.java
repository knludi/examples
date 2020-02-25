package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardReader {

    private static String readFromKeyboard;

    public static String getReadFromKeyboard(String displayMessage) {

        System.out.println(displayMessage);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            readFromKeyboard =  bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return readFromKeyboard;
    }
}
