package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue {

    public static void main(String[] args)
    {
        int a =10;
        updateNum(a);

        System.out.println(a);

        String name = " Esakki Muthu";
        updateString(name);
        System.out.println(name);

        Boolean status = Boolean.TRUE;
        updateBoolean(status);
        System.out.println(status);

        int[] nums = new int[]{1,2,3,4,5};
        updateArray(nums);
        System.out.println(Arrays.toString(nums));

        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        updateList(names);
        System.out.println(names);

        int b = 10;

        {
            b=15;
        }
        System.out.println(b);

    }

    public static void updateBoolean(Boolean status)
    {
        status=Boolean.FALSE;
    }

    public static void updateArray(int[] arr)
    {
        arr[0]=100;
        arr[1]=200;
    }

    public static void updateString(String name)
    {
        name="121";
    }

    public static void updateNum(int a)
    {
        a=-1;
    }

    public static void updateList(List<String> names)
    {
        names.remove(1);
        names.add("d");
    }
}