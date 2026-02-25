public class TypeCastingDemo {
    public static void main(String[] args) {

        double a = 10.5;
        int b = (int) a;

        float n = 25.99f;
        int f = (int) n;

        System.out.println(b);
        System.out.println(f);

        byte b1 = 127;
        b1++;
        System.out.println(b1);

        byte p = (byte)130;
        System.out.println(p);

        int m = 10;
        double d = 5.5;
        System.out.println(m + d);

        int num2 = 66;
        char ch2 = (char)num2;
        System.out.println(ch2);
    }
}
