package Block4;

import java.util.List;

public class Tests {
	
	public static void printTests()
	{
		System.out.println("BLOCK4 TESTS");
        System.out.println(Block4.StringOps.BessieEssay("Test essay", 2, 6));
        System.out.println(Block4.StringOps.Split("((()))(())()()(()())"));
        System.out.println(Block4.StringOps.toCamelCase("hello_edabit"));
        System.out.println(Block4.StringOps.toSnakeCase("helloEdabit"));
        System.out.println(Block4.Math.overTime(16, 18, 30, 1.8));
		System.out.println(Block4.Math.BMI("205 pounds", "73 inches"));
		System.out.println(Block4.Math.bugger(999));
		System.out.println(Block4.StringOps.toShortHand("abbccc"));
        System.out.println(Block4.StringOps.doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println(Block4.StringOps.trouble(451999277, 411777899));
		System.out.println(Block4.StringOps.countUniqueBooks("$AA$BBCATT$C$$B$", "$"));
		System.out.println();
	}
}
