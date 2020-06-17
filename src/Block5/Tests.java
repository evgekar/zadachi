package Block5;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Tests {

    public static void printTests() throws NoSuchAlgorithmException {
        System.out.println("BLOCK5 TESTS");
        System.out.println(Arrays.toString(Block5.StringOps.encrypt("Hello")));
        System.out.println(Block5.StringOps.decrypt(new int[]{72, 29, 7, 0, 3}));
        System.out.println(Block5.Chess.canMove("Pawn", "E2", "E4"));
        System.out.println(Block5.StringOps.canComplete("butl", "beautiful"));
        System.out.println(Block5.Math.sumDigProd(new int[] {0}));
        System.out.println(Block5.StringOps.sameVowelGroup(new String[] {"hoops", "chuff", "bot", "bottom"}));
        System.out.println(Block5.Card.validateCard(1234567890123452L));
        System.out.println(Block5.NumbersToWords.toEng(919));
        System.out.println(Block5.NumbersToWords.toRus(919));
        System.out.println(Block5.StringOps.getSha256Hash("password123"));
        System.out.println(Block5.StringOps.correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(Block5.Math.hexLattice(37));
        System.out.println();
    }
}
