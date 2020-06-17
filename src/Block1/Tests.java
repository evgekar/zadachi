package Block1;

public class Tests {

    public static void printTests()
    {
        System.out.println("BLOCK1 TESTS");
        System.out.println(Tasks.remainder(5, 3));
        System.out.println(Tasks.triArea(5, 3));
        System.out.println(Tasks.animals(2, 3, 5));
        System.out.println(Tasks.profitableGamble(0.2, 50, 9));
        System.out.println(Tasks.operation(24, 15, 9));
        System.out.println(Tasks.ctoa('A'));
        System.out.println(Tasks.addUpTo(10));
        System.out.println(Tasks.nextEdge(8, 10));
        System.out.println(Tasks.sumOfCubes(new int[]{1, 5, 9}));
        System.out.println(Tasks.abcmath(42, 5, 10));
        System.out.println();
    }

}
