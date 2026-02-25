public class RemoveDuplicates {
    public static void main(String[] args) {

        String s1 = "madam";
        String result = "";

        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (result.indexOf(c) == -1) {
                result += c;
            }
        }

        System.out.println("Original: " + s1);
        System.out.println("Without duplicates: " + result);
    }
}
