package TwoWeek;

public class HighestAltitude {

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int maxAlt = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];          
            if (sum > maxAlt) {
                maxAlt = sum;        
            }
        }

        return maxAlt;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};

        int result = largestAltitude(gain);

        System.out.println("Highest Altitude: " + result);
    }
}
