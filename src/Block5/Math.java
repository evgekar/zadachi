package Block5;

public class Math {

    public static int sumDigProd(int[] numbers)
    {
        int result = 0;

        for (int i = 0; i < numbers.length; i++)
        {
         result += numbers[i];
        }

        result = Block4.Math.multiplyDigits(result);
        while (Integer.toString(result).length() != 1)
            result = Block4.Math.multiplyDigits(result);
        return result;
    }

    public static String hexLattice(int num)
    {
        int n = centeredHexNum(num);
        if (n == -1)
            return "Invalid";

        String result = "";

        for (int i = 0; i < n; i++)
        {

            for (int k = 0; k < n - i; k++)
            {
                result += " ";
            }

            for (int j = 0; j < n + i; j++ )
            {
                result += "o ";
            }
            result += "\n";
        }



        for (int i = n - 2; i >= 0; i--)
        {

            for (int k = 0; k < n - i; k++)
                result += " ";

            for (int j = 0; j < n + i; j++)
            {
                result += "o ";
            }
            result += "\n";
        }
        return result;



    }

    private static int centeredHexNum(int num)
    {
        int count = 1;
        int result = count * 3 * (count - 1) + 1;
        while (result <= num)
        {
            if (result == num)
                return count;
            else
            {
                count++;
                result = count * 3 * (count - 1) + 1;
            }
        }
        return -1;
    }

}
