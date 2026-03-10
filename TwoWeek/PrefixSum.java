package TwoWeek;

public class PrefixSum {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 7, 10};
        int n = arr.length;

        int sum = 0;
        int new_arr[] = new int[n];
        new_arr[0] = arr[0];

        for (int i = 0; i < n - 1; i++) {
            sum = arr[i] + arr[i + 1];
            new_arr[i + 1] = sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }
}
