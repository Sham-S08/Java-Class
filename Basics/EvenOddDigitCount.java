package Basics;
public class EvenOddDigitCount {
    public static void main(String[] args) {

        int a = 1234;
        int evenCount = 0;
        int oddCount = 0;

        while (a > 0) {
            int digit = a % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            a = a / 10;
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}
