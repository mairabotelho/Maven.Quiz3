package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    VowelUtils vowel = new VowelUtils();

    public String translate(String str) {
       String[] input = str.split(" ");
       String result = "";

       for(int index = 0; index < input.length; index++){
           result += checkTranslate(input[index]) + " ";
       }

        return result.trim();
    }

    public String checkTranslate(String word){

        if(vowel.isVowel(word.charAt(0)))
            return word + "way";
        else {
            int indexVowel = vowel.getIndexOfFirstVowel(word);

            if (indexVowel == -1)
                return word + "ay";
            else
                return word.substring(indexVowel, word.length()) + word.substring(0, indexVowel) + "ay";
        }
    }
}
