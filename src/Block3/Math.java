package Block3;

public class Math {

    public static int solutions(int a, int b, int c)
    {
        int discriminant = b * b - 4 * a * c;
        if (discriminant > 0) return 2;
        else if (discriminant == 0) return 1;
        else return 0;
    }

    public static boolean checkPerfect(int number)
    {
        int sum = 1;
        for (int i = 2; i * i < number; i++)
        {
            if (number % i == 0)
            {
                sum += i;
                if (i * i != number)
                    sum += number / i;
            }
        }
        return sum == number;
    }

    public static boolean isKaprekar(int num)
    {
        String square = Integer.toString(num * num);
        String right;
        String left;
        if (square.length() == 1)
        {
            return Integer.parseInt(square) == num;
        }
        else
        {
            left = square.substring(0, square.length() / 2);
            right = square.substring(square.length() / 2);
            return Integer.parseInt(left) + Integer.parseInt(right) == num;
        }
    }

    private static boolean isPrime(int num)
    {
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int nextPrime(int num)
    {
        for (int i = num; i < 1000; i++)
        {
            if (isPrime(i))
                return i;
        }
        return -1;
    }


    public static boolean rightTriangle(int a, int b, int c)
    {
        int SquareA = a * a;
        int SquareB = b * b;
        int SquareC = c * c;

        return SquareA == SquareB + SquareC ||
                SquareB == SquareA + SquareC ||
                SquareC == SquareA+ SquareB;
    }

}
