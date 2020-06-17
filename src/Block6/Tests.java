package Block6;

import javax.script.ScriptException;
import java.util.Arrays;

public class Tests {

    public static void printTests() throws ScriptException {
        System.out.println("BLOCK6 TESTS");
        System.out.println(Math.Bell(10));
        System.out.println(StringOps.translateWord("button"));
        System.out.println(StringOps.translateSentence("Do you think, it is going to rain today?"));
        System.out.println(StringOps.validColor("rgb(255,255,255,0.2342)"));
        System.out.println(StringOps.stripUrlParams("https://edabit.com?a=1&b=2&a=2", new String[] {"b", "a"}));
        System.out.println(Arrays.toString(StringOps.getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")));
        System.out.println(Math.ulam(206));
        System.out.println(StringOps.longestNonrepeatingSubstring("abcde"));
        System.out.println(Math.convertToRoman(16));
        System.out.println(Math.formula("6 * 4 = 24"));
        System.out.println(Math.palindromeDescendant(123312));
    }


}
