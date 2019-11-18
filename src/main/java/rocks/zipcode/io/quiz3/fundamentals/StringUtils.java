package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {

    public static int counter;
    public static String sub;

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String result = "";

        for(int index = 0; index < str.length(); index++){
            if(index == indexToCapitalize){
                result += Character.toUpperCase(str.charAt(index));}
            else
                result += str.charAt(index);
        }

        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Character check = baseString.charAt(indexOfString);

        if(check.equals(characterToCheckFor))
            return true;

        return false;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> allSubstring = new ArrayList<>();
        counter = 0;

        for(int index = 0; index < string.length(); index++){
            for (int index2 = 1 + index; index2 < string.length() + 1; index2++){
                sub = string.substring(index, index2);

                if(!allSubstring.contains(sub)) {
                    allSubstring.add(sub);
                    counter++;
                }
            }

            sub = "";
        }

        return allSubstring.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){

        getAllSubStrings(input);

        return counter;
    }
}
