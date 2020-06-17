package Block3;

import java.util.*;

public class ArrayOps {




    private static int uniqueCount(int[] arr)
    {
        int count = 1;
        boolean unique = true;
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] == arr[i]) {
                    unique = false;
                    break;
                }
            }
            if (unique) count++;
            unique = true;
        }
        return count;
    }

    public static boolean same(int[] arr1, int[] arr2)
    {
        return uniqueCount(arr1) == uniqueCount(arr2);
    }


}
