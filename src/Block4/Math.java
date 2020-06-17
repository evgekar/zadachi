package Block4;

public class Math {

    public static double overTime(double start, double end, double rate, double modifier)
    {
        if (start <= 17.0)
        {
            if (end > 17.0)
            {
                return (17.0 - start) * rate + (end - 17.0) * rate * modifier;
            }
            else
            {
                return (end - start) * rate;
            }
        }
        else
        {
            return (end - start) * rate * modifier;
        }
    }

    public static String BMI(String weight, String height)
    {
        String[] Weight = weight.split(" ");
        String[] Height = height.split(" ");

        double ParsedWeight = Double.parseDouble(Weight[0]);
        double ParsedHeight = Double.parseDouble(Height[0]);

        final double kilosToPounds = 2.20462;
        final double metersToInches = 39.3701;

        if (Weight[1].equals("pounds"))
            ParsedWeight /= kilosToPounds;
        if (Height[1].equals("inches"))
            ParsedHeight /= metersToInches;

        double result = ParsedWeight / ParsedHeight / ParsedHeight;
        result = (double)(java.lang.Math.round(result * 10 )) / 10;

        String category = "";

        if (result < 18.5)
            category = "Underweight";
        else if (result < 25)
            category = "Normal weight";
        else
            category = "Overweight";

        return Double.toString(result) + " " + category;
    }

    public static int bugger(int num)
    {
        int count = 1;

        while (Integer.toString(multiplyDigits(num)).length() != 1)
        {
            num = multiplyDigits(num);
            count++;
        }


        return count;
    }

    public static int multiplyDigits(int num)
    {
        if (num == 0)
            return 0;
        int result = 1;
        while (num > 0)
        {
            result *= num % 10;
            num /= 10;
        }

        return result;
    }

}
