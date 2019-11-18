package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    public static Boolean hasVowels(String word) {

        for(int index = 0; index < word.length(); index++)
            if(isVowel(word.charAt(index)))
                return true;

        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        for(int index = 0; index < word.length(); index++)
            if(isVowel(word.charAt(index)))
                return index;

        return -1;
    }


    public static Boolean startsWithVowel(String word) {

        if(isVowel(word.charAt(0)))
            return true;

        return false;
    }

    public static Boolean isVowel(Character character) {
        Character lowerCase = Character.toLowerCase(character);

        if(lowerCase.equals('a') || lowerCase.equals('e') || lowerCase.equals('i')
                            || lowerCase.equals('o') || lowerCase.equals('u'))
            return true;

        return false;
    }
}
