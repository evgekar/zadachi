package Block2;

public class Math {

    private static int Max(int[] arr)
    {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > result)
                result = arr[i];
        }
        return result;
    }

    private static int Min(int[] arr)
    {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < result)
                result = arr[i];
        }
        return result;
    }

    private static double Avg(int[] arr)
    {
        int sum = 0;
        for (int el : arr)
        {
            sum += el;
        }
        return (double)sum / arr.length;

    }

    public static int differenceMaxMin(int[] arr)
    {
        return Max(arr) - Min(arr);
    }

    public static boolean isAvgWhole(int[] arr)
    {
        double avg = Avg(arr);
        return avg == (int)avg;
    }

    public static int[] cumulativeSum(int[] arr)
    {
        int[] result = new int[arr.length];
        result[0] = arr[0];

        for (int i = 1; i < result.length; i++)
        {
            result[i] = arr[i];
            result[i] += result[i - 1];
        }

        return result;
    }

    public static int Fibonacci(int num)
    {
        if (num == 1) return 1;
        if (num == 2) return 2;
        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }

    public static int boxSeq(int step)
    {
        if (step % 2 == 0)
            return step;
        else
            return step + 2;
    }

}
