package Block2;

public class Tests {

    public static void printTests()
    {
        System.out.println("BLOCK2 TESTS");
        System.out.println(StringOps.repeat("mice", 5));
        System.out.println(Math.differenceMaxMin(new int[] { 10, 4, 1, 4, -10, -50, 32, 21 }));
        System.out.println(Math.isAvgWhole(new int[] { 9, 2, 2, 5}));
        int[] arr = Math.cumulativeSum(new int[] {3, 3, -2, 408, 3, 3});
        for (int el : arr) System.out.print(el + " ");
        System.out.println();
        System.out.println(StringOps.getDecimalPlaces("43.20"));
        System.out.println(Math.Fibonacci(12));
        System.out.println(StringOps.isValid("59001"));
        System.out.println(StringOps.isStrangePair("ratio", "orator"));
        System.out.println(StringOps.isPrefix("automation", "auto-"));
        System.out.println(StringOps.isSuffix("arachnophobia", "-phobia"));
        System.out.println(Math.boxSeq(3));
        System.out.println();
    }

}
