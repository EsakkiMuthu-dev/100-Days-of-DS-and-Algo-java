package day2;

import java.util.Scanner;

public class Count {
    public static void main(String[] args)
    {
        int num = 124324223;
        System.out.println(" <---------- Count no of occurenes  of given number --------->");
        System.out.println("Number : "+ num);
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        // if the value is 2 , we need to find how many times 2 present in the above num variable

        int totalCount = 0 ;
        while(num > 0)
        {
           int lastDigit = num%10;
           if(lastDigit == userInput)
               totalCount++;
           num = num/10;
        }

        System.out.println(" Total Number of occurences of "+userInput + "  in given number is "+ totalCount);

    }
}