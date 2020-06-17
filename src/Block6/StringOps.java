package Block6;

import java.util.HashMap;
import java.util.Map;

public class StringOps {

    private static int firstVowel(String word)
    {
        String vowels = "AaEeIiOoUuYy";
        for (int i = 0; i < word.length(); i++)
        {
            if (vowels.contains(Character.toString(word.charAt(i))))
            {
                return i;
            }
        }
        return -1;
    }

    public static String translateWord(String word)
    {
        if (word == "") return "";
        int firstVowel = firstVowel(word);
        if (firstVowel == 0)  return word + "yay";
        if (firstVowel == -1) return word + "ay";

        return word.substring(firstVowel) + word.substring(0, firstVowel) + "ay";
    }

    public static String translateSentence(String sentence)
    {
        String[] words = sentence.split(" ");
        String result  = "";
        for (int i = 0; i < words.length; i++)
        {
            String buffer = "";
            if (!Character.isLetter(words[i].charAt(words[i].length() - 1)))
            {
                char last = words[i].charAt(words[i].length() - 1);
                words[i] = words[i].substring(0, words[i].length() - 1);
                buffer = translateWord(words[i]) + Character.toString(last) + " ";
            }
            else
            {
                buffer = translateWord(words[i]) + " ";
            }

            if (buffer != buffer.toLowerCase())
            {
                buffer = buffer.substring(0, 1).toUpperCase() + buffer.substring(1).toLowerCase();
            }
            result += buffer;
        }
        return result;
    }

    public static boolean validColor(String color)
    {
        if (!color.contains("rgb"))
            return false;
        String value = color.substring(color.indexOf("(") + 1, color.indexOf(")"));
        String[] numbers = value.split(",");

        if (color.contains("rgba") && numbers.length != 4)
            return false;
        if (color.contains("rgb") && !color.contains("rgba") && numbers.length != 3)
            return false;

        for (int i = 0; i < 3; i++)
        {
            if (Integer.parseInt(numbers[i]) < 0 || Integer.parseInt(numbers[i]) > 255)
                return false;
        }

        if (numbers.length == 4)
        {
            if (Double.parseDouble(numbers[3]) < 0 || Double.parseDouble(numbers[3]) > 1)
                return false;
        }
        return true;

    }

    public static String stripUrlParams(String url, String ...param)
    {
        Map<String, Integer> values = new HashMap<String, Integer>();
        String[] parts = url.split("\\?");

        if (parts.length < 2)
            return url;

        String[] params = parts[1].split("&");

        for (String parameter : params)
        {
            String key = parameter.substring(0, parameter.indexOf('='));
            String valueStr = parameter.substring(parameter.indexOf('=') + 1);
            int value = Integer.parseInt(valueStr);
            values.put(key, value);

        }

        String result = "";

        result += parts[0] + "?";

        for (String key : values.keySet())
        {
            boolean notDisplay = false;
            for (int i = 0; i < param.length; i++)
            {
                if (param[i].contains(key))
                {
                    notDisplay = true;
                }
            }
            if (notDisplay)
                continue;
            result += key + "=" + values.get(key) + "&";
        }

        return result.substring(0, result.length() - 1);

    }

    public static String[] getHashTags(String str)
    {
        String[] values = { "", "", ""};

        String[] words = str.split(" ");

        for(String word : words)
        {
            if (!Character.isLetter(word.charAt(word.length() - 1)))
                word = word.substring(0, word.length() - 1);

            if (word.length() > values[0].length())
            {
                values[2] = values[1];
                values[1] = values[0];
                values[0] = word;
            }
            else if (word.length() > values[1].length())
            {
                values[2] = values[1];
                values[1] = word;
            }
            else if (word.length() > values[2].length())
            {
                values[2] = word;
            }
        }

        for (int i = 0; i < values.length; i++)
        {
            values[i] = "#" + values[i];
        }

        return values;
    }

    public static String longestNonrepeatingSubstring(String str)
    {
        String result = "";
        String buffer = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (!buffer.contains(str.substring(i, i + 1)))
            {
                buffer += str.substring(i, i + 1);
            }
            else
            {
                if (buffer.length() > result.length())
                    result = buffer;

                buffer = buffer.substring(buffer.indexOf(str.charAt(i)));
            }
        }
        if (buffer.length() > result.length())
            result = buffer;

        return result;
    }

}
