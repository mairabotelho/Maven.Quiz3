package rocks.zipcode.io.quiz3.arrays;

import static java.lang.Character.isLetter;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] result;

    public static String[] wave(String str) {
        result = new String[str.length()];
        str.toLowerCase();

        for(int index = 0; index < str.length(); index++) {

                result[index] = str.substring(0, index) + Character.toUpperCase(str.charAt(index)) +
                        str.substring(index, str.length() - 1);

        }

        return result;
    }
}
