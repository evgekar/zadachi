package Block2;

public class StringOps {

    public static String repeat(String str, int repeatCount)
    {
        String result = "";
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < repeatCount; j++)
            {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int getDecimalPlaces(String str)
    {
        return str.length() - str.indexOf('.') - 1;
    }


    public static boolean isValid(String postIndex)
    {
        if (postIndex.length() > 5)
            return false;
        for (int i = 0; i < postIndex.length(); i++)
        {
            if (!Character.isDigit(postIndex.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean isStrangePair(String str1, String str2)
    {
        return str1.charAt(str1.length() - 1) == str2.charAt(0) &&
                str2.charAt(str2.length() - 1) == str1.charAt(0);
    }

    public static boolean isPrefix(String word, String prefix)
    {
        String actualPrefix = prefix.substring(0, prefix.length() - 2);
        return word.startsWith(actualPrefix);
    }

    public static boolean isSuffix(String word, String suffix)
    {
        String actualSuffix = suffix.substring(1);
        return word.endsWith(actualSuffix);
    }
}
