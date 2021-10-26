package ua.lviv.lgs;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IllegalAccessException, MyException {
        System.out.println("Enter first number: ");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter second number: ");
        Scanner b = new Scanner(System.in);

        int num1 = a.nextInt();
        int num2 = b.nextInt();

        if (num1 < 0 && num2 < 0)
            throw new IllegalArgumentException();


        if (num1 == 0 && num2 != 0 || num1 != 0 && num2 == 0)
            throw new ArithmeticException();

        if (num1 == 0 && num2 == 0)
            throw new IllegalAccessException();

        if (num1 > 0 && num2 > 0)
            throw new MyException();
    }
}
