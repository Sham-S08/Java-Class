package Basics;
public class NumberPalindrome {
    public static void main(String[] args) {

        int a = 121;
        int original = a;
        int reverse = 0;

        while (a > 0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
