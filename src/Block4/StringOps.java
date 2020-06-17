package Block4;

import java.util.LinkedList;
import java.util.List;

public class StringOps {

    public static List<String> BessieEssay(String essay, int wordsNumber, int lineLength)
    {
        String[] words = essay.split(" ");
        List<String> result = new LinkedList<String>();
        int remaining = lineLength;
        String str = "";
        for (String word : words)
        {
            if (remaining >= word.length())
            {
                str += word;
                remaining -= word.length();
            }
            else
            {
                result.add(str);
                str = word;
                remaining = lineLength - word.length();
            }
        }
        result.add(str);
        return result;
    }
    
    public static List<String> Split(String brackets)
    {
    	List<String> result = new LinkedList<String>();
    	int count = 0;
    	String buffer = "";
    	for(int i = 0; i < brackets.length(); i++)
    	{
    		if (brackets.charAt(i) == '(')
    			count++;
    		else if (brackets.charAt(i) == ')')
    			count--;
    		
    		buffer += brackets.charAt(i);
    		if (count == 0)
    		{
    			result.add(buffer);
    			buffer = "";
    		}	
    	}
    	
    	return result;
    }
    
    public static String toCamelCase(String str)
    {
    	String[] parts = str.split("_");
    	
    	return  parts[0] + parts[1].substring(0, 1).toUpperCase() + parts[1].substring(1);
    }
    
    public static String toSnakeCase(String str)
    {
        String first = "", second = "";
    	for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i)))
            {
                first = str.substring(0, i);
                second = str.substring(i);
                break;
            }
        }

    	return first + "_" + second.toLowerCase();
    }

    public static String toShortHand(String str)
    {
        int count = 1;
        String result = "";

        for(int i = 0; i < str.length() - 1; i++)
        {
            if (str.charAt(i) == str.charAt(i + 1))
                count++;
            else
            {
                if (count > 1)
                {
                    result += str.charAt(i) + "*" + Integer.toString(count);
                    count = 1;
                }
                else {
                    result += str.charAt(i);
                }
            }
        }
        if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2))
            result += str.charAt(str.length() - 1) + "*" + Integer.toString(count);
        else result += str.charAt(str.length() - 1);

        return result;
    }

    public static boolean doesRhyme(String str1, String str2)
    {
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");

        return takeVowels(words1[words1.length - 1]).equals(takeVowels(words2[words2.length - 1]));
    }

    public static String takeVowels(String str)
    {
        String vowels = "AEIOUaeiou";
        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (vowels.contains(Character.toString(str.charAt(i))))
                result += str.charAt(i);
        }
        return result;
    }

    public static boolean trouble(long num1, long num2)
    {
        for (int i = 1; i < 10; i++)
        {
            if (Long.toString(num1).contains(Integer.toString(i) + Integer.toString(i) + Integer.toString(i)))
            {
                if (Long.toString(num2).contains(Integer.toString(i) + Integer.toString(i)))
                    return true;
            }

        }
        return false;
    }

    public static int countUniqueBooks(String str, String separator)
    {
        String special = "[$&+,:;=?@#|'<>.-^*()%!]";
        if (special.contains(separator))
            separator = Character.toString('\\') + separator;
        String[] books = str.split(separator);
        int sum = 0;

        for (int i = 1; i < books.length; i += 2)
        {
            sum += countUniqueChars(books[i]);
        }
        return sum;
    }

    private static int countUniqueChars(String str)
    {
        int result = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (i == str.lastIndexOf(str.charAt(i)))
                result++;
        }
        return result;
    }




}
