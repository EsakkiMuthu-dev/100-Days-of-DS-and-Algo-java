package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysEXample {
    static void main(String[] args) {

        int[] arr =  new int[8];
        arr[0] =1;
        arr[1] = 12;

        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = new ArrayList<>();
        list.add("Something");
        list.add("Anything");
        list.add("Nothing");

        System.out.println(list);
    }
}