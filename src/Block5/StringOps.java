package Block5;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;

public class StringOps {

    public static int[] encrypt(String msg)
    {
        int[] result = new int[msg.length()];
        char[] chars = msg.toCharArray();
        result[0] = chars[0];
        for (int i = 1; i < chars.length; i++)
        {
            result[i] = chars[i] - chars[i - 1];
        }

        return result;
    }

    public static String decrypt(int[] arr)
    {
        char[] chars = new char[arr.length];
        chars[0] = (char)arr[0];
        int code = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            code += arr[i];
            chars[i] = (char)(code);
        }

        return new String(chars);
    }

    public static boolean canComplete(String sub, String full)
    {
        int count = 0;
        for (int i = 0; i < full.length(); i++)
        {
            if (full.charAt(i) == sub.charAt(count))
            {
                count++;
                if (count == sub.length())
                    return true;
            }
        }

        return false;
    }

    public static List<String> sameVowelGroup(String[] arr)
    {
        List<String> result = new LinkedList<String>();
        String vowels = Block4.StringOps.takeVowels(arr[0]);
        result.add(arr[0]);

        for (int i = 1; i < arr.length; i++)
        {
            boolean flag = true;
            for (int j = 0; j < arr[i].length(); j++)
            {
                if (isVowel(arr[i].charAt(j)) && !vowels.contains(arr[i].substring(j, j + 1)))
                    flag = false;
            }
            if (flag)
                result.add(arr[i]);
        }
        return result;

    }

    private static boolean isVowel(char ch)
    {
        String vowels = "AOUIEaouie";
        return vowels.contains(Character.toString(ch));
    }

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    public static String getSha256Hash(String msg) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(msg.getBytes(StandardCharsets.UTF_8));

        char[] hexChars = new char[hash.length * 2];
        for (int j = 0; j < hash.length; j++) {
            int v = hash[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static String correctTitle(String title)
    {
        String[] words = title.split(" ");
        String result = "";
        for (String word : words)
        {
            if (word.toLowerCase().equals("the") || word.toLowerCase().equals("in") ||
                    word.toLowerCase().equals("and") || word.toLowerCase().equals("of"))
            {
                result += word.toLowerCase() + " ";
                continue;
            }

            if (word.contains("-"))
            {
                String firstHalf = word.substring(0, 1).toUpperCase() + word.substring(1, word.indexOf('-'));
                String secondHalf = word.substring(word.indexOf('-') + 1, word.indexOf('-') + 2).toUpperCase() +
                        word.substring(word.indexOf('-') + 2);
                result += firstHalf + "-" + secondHalf + " ";
                continue;
            }
            word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            result += word + " ";
        }
        return result;
    }
}
