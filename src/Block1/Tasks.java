package Block1;

public class Tasks {

    public static int remainder(int dividend, int divider)
    {
        return dividend % divider;
    }

    public static double triArea(double base, double height)
    {
        return base * height / 2;
    }

    public static int animals(int chickens, int cows, int pigs)
    {
        return chickens * 2 + cows * 4 + pigs * 4;
    }

    public static boolean profitableGamble(double prob, double prize, double pay)
    {
        return prob * prize > pay;
    }

    public static String operation(int target, int arg1, int arg2)
    {
        if (arg1 + arg2 == target) return "added";
        else if (arg1 - arg2 == target) return "substracted";
        else if (arg1 * arg2 == target) return "multiplied";
        else if (arg1 / arg2 == target && arg1 / arg2 == (double)arg1 / arg2) return "divided";
        else return "none";
    }

    public static int ctoa(char c)
    {
        return c;
    }

    public static int addUpTo(int num)
    {
        int result = 0;
        for (int i = 1; i <= num; i++)
        {
            result += i;
        }
        return result;
    }

    public static int nextEdge(int firstSide, int secondSide)
    {
        return firstSide + secondSide - 1;
    }

    public static int sumOfCubes(int[] array)
    {
        int result = 0;

        for (int el : array)
        {
            result += el * el * el;
        }
        return result;
    }

    public static boolean abcmath(int A, int B, int C)
    {
        for (int i = 0; i < B; i++)
        {
            A += A;
        }

        return A % C == 0;
    }
}
