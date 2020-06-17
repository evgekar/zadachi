package Block3;

public class Tests {

    public static void printTests()
    {
        System.out.println("BLOCK3 TESTS");
        System.out.println(Math.solutions(1, 0, -1));
        System.out.println(StringOps.findZip("all zip files are zipped"));
        System.out.println(Math.checkPerfect(496));
        System.out.println(StringOps.flipEndChars("Cat, dog and mouse."));
        System.out.println(StringOps.isValidHexCode("#CD5C5C"));
        System.out.println(ArrayOps.same(new int[]{1, 3, 4, 4, 4}, new int[]{2, 5, 7}));
        System.out.println(Math.isKaprekar(297));
        System.out.println(StringOps.longestZero("01100001011000"));
        System.out.println(Math.nextPrime(24));
        System.out.println(Math.rightTriangle(145, 105, 100));
        System.out.println();
    }
}
