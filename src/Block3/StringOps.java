package Block3;

public class StringOps {


    public static int findZip(String str)
    {
        if (str.indexOf("zip") == str.lastIndexOf("zip"))
            return -1;
        return str.indexOf("zip", str.indexOf("zip") + 3);
    }

    public static String flipEndChars(String str)
    {
        if (str.length() == 1) return "Incompatible.";
        else if (str.charAt(0) == str.charAt(str.length() - 1)) return "Two's a pair.";
        else
        {
            char[] newStr = str.toCharArray();
            char tmp = newStr[0];
            newStr[0] = newStr[newStr.length - 1];
            newStr[newStr.length - 1] = tmp;
            String result = new String(newStr);
            return result;
        }
    }

    public static boolean isValidHexCode(String str)
    {
        str = str.toLowerCase();
        if (str.charAt(0) != '#')
            return false;
        if (str.length() != 7)
            return false;
        for (int i = 1; i < str.length(); i++)
        {
            try
            {
                Integer.parseInt(str.substring(1), 16);
            }
            catch(NumberFormatException e)
            {
                return false;
            }
        }
        return true;
    }

    public static String longestZero(String binaryString)
    {
        String result = "";
        String buffer = "";

        char[] str = binaryString.toCharArray();
        for (char el : str)
        {
            if (el == '0')
                buffer += '0';
            else
            {
                if (buffer.length() > result.length())
                    result = buffer;
                buffer = "";
            }
        }
        return result;
    }



}
