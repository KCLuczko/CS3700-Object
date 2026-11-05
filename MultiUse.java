public class MultiUse {

    public static void main(String[] args) {
        System.out.println("Counting to 5:");
        multiUse(5);

        // ints get promoted to double here
        double avg = multiUse(7, 8);
        System.out.println("Average of 7 and 8: " + avg);
        System.out.println("Average of 10 and 4.5: " + multiUse(10, 4.5));

        // cast to int, drops the decimal
        int avgInt = (int) multiUse(7, 8);
        System.out.println("Average as int: " + avgInt);

        double max = multiUse(3, 19, 12);
        System.out.println("Max of 3, 19, 12: " + max);
        System.out.println("Max of 2.5, -1, 2.75: " + multiUse(2.5, -1, 2.75));

        int maxInt = (int) multiUse(4.9, 8.6, 1.2);
        System.out.println("Max as int: " + maxInt);
    }

    // prints 1 to n
    public static void multiUse(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // average
    public static double multiUse(double a, double b) {
        return (a + b) / 2;
    }

    // max
    public static double multiUse(double a, double b, double c) {
        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
