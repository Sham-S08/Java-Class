package Basics;
public class SumOfDigits {
    public static void main(String[] args) {

        int a = 123;
        int sum = 0;

        while (a > 0) {
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
