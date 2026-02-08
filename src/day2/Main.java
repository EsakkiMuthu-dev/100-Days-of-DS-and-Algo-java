package day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hey");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int grade = sc.nextInt();
        float marks =sc.nextFloat();
        boolean status = sc.nextBoolean();

        System.out.println("<---- Details  ---- > \n");
        System.out.println(" Name  : "+ name);
        System.out.println(" Grade  : "+ grade);
        System.out.println(" Mark  : "+ marks);
        System.out.println(" Status  : "+ status);

        System.out.println("\n  <---------------------> \n");
    }
}