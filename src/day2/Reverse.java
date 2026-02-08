package day2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        System.out.println("<----- Reverse a Given Number ------->");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter an Nuber you want to reverse : ");
        int number = sc.nextInt();
        int reverseNumber = 0;
        while(number > 0)
        {
            int lastDigit = number%10;
            reverseNumber = (reverseNumber*10) + lastDigit;
            number = number/10;
        }

        System.out.println(" Reveresed Number is "+ reverseNumber );
    }
}