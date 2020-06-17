package Block6;

import java.util.Vector;
import javax.print.attribute.IntegerSyntax;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Math {

    private static int C(int n, int k)
    {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static int factorial(int n)
    {
        if (n == 0) return 1;
        else
        {
            int result = 1;
            for(int i = 2; i <= n; i++)
            {
                result *= i;
            }
            return result;
        }
    }

    public static int Bell(int n)
    {
        if (n == 0) return 1;
        else
        {
            int sum = 0;
            for (int k = 0; k < n; k++)
            {
                sum += C(n-1, k) * Bell(n - k - 1);
            }
            return sum;
        }
    }

    public static int ulam(int n)
    {
        Vector<Integer> values = new Vector<Integer>();

        values.add(1);
        values.add(2);

        for (int i = 3; i < 2000; i++)
        {
            int count = 0;
            for (int j = 0; j < values.size() - 1; j++)
            {
                for (int k = j + 1; k < values.size(); k++)
                {
                    if (values.get(j) + values.get(k) == i)
                        count++;

                }
            }
            if (count == 1)
                values.add(i);
            if (values.size() == n)
                return i;
        }

        return -1;
    }

    public static String convertToRoman(int num) {
        String res = "";
        while (num >= 1000) {
            res += "M";
            num -= 1000; }
        while (num >= 900) {
            res += "CM";
            num -= 900;
        }
        while (num >= 500) {
            res += "D";
            num -= 500;
        }
        while (num >= 400) {
            res += "CD";
            num -= 400;
        }
        while (num >= 100) {
            res += "C";
            num -= 100;
        }
        while (num >= 90) {
            res += "XC";
            num -= 90;
        }
        while (num >= 50) {
            res += "L";
            num -= 50;
        }
        while (num >= 40) {
            res += "XL";
            num -= 40;
        }
        while (num >= 10) {
            res += "X";
            num -= 10;
        }
        while (num >= 9) {
            res += "IX";
            num -= 9;
        }
        while (num >= 5) {
            res += "V";
            num -= 5;
        }
        while (num >= 4) {
            res += "IV";
            num -= 4;
        }
        while (num >= 1) {
            res += "I";
            num -= 1;
        }
        return res;
    }

    public static boolean formula(String str) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String[] expressions = str.split("=");
        Vector<Integer> results = new Vector<Integer>();

        for (String expression : expressions)
        {
            results.add((Integer) engine.eval(expression));
        }

        int check = results.get(0);

        for (Integer value : results)
        {
            if (value != check)
                return false;
        }

        return true;

    }

    public static boolean palindromeDescendant(int num)
    {
        String number = Integer.toString(num);
        StringBuilder input = new StringBuilder();
        input.append(number);

        while (input.length() > 1)
        {
            if (input.toString().equals(input.reverse().toString()))
                return true;

            if (input.length() % 2 != 0)
                return false;

            String next = sumDigits(input.reverse().toString());

            input.setLength(0);
            input.append(next);
        }

        return false;
    }

    private static String sumDigits(String num)
    {
        String result = "";
        for (int i = 0; i < num.length() - 1; i+=2)
        {
            int sum = Character.digit(num.charAt(i), 10) + Character.digit(num.charAt(i + 1), 10);
            result += Integer.toString(sum);
        }
        return result;
    }

}
