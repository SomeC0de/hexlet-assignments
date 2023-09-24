package exercise;

import java.util.ArrayList;
import java.util.List;
// BEGIN
public class App {
    public static boolean scrabble(String input, String word) {
        boolean isScrabbled;

        if (input.length() < word.length()) {
            isScrabbled = false;
        } else if ((input.isEmpty()) || (word.isEmpty())) {
            isScrabbled = false;
        } else {
            // Array to ArrayList Conversion
            String[] inputLetters = input.split("");
            List<String> inputList = new ArrayList<>();
            for (String letter : inputLetters) {
                inputList.add(letter);
            }

            // Array to ArrayList Conversion
            String[] wordLetters = word.split("");
            List<String> wordList = new ArrayList<>();
            for (String letter : wordLetters) {
                wordList.add(letter);
            }

            boolean isFound = true;

            for (String letter : wordList) {
                if (inputList.contains(letter)) {
                    inputList.remove(letter);
                } else {
                    isFound = false;
                    break;
                }
            }

            isScrabbled = isFound;
        }

        return isScrabbled;
    }
}
//END
