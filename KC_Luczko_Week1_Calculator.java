import java.util.Scanner;

public class KC_Luczko_Week1_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scan.nextDouble();
        System.out.print("Enter y: ");
        double y = scan.nextDouble();

        System.out.println();
        System.out.println("Addition: " + x + " + " + y + " = " + (x + y));
        System.out.println("Subtraction: " + x + " - " + y + " = " + (x - y));
        System.out.println("Multiplication: " + x + " * " + y + " = " + (x * y));

        // cant divide by 0
        if (y == 0) {
            System.out.println("Division: can't divide by zero");
        } else {
            System.out.println("Division: " + x + " / " + y + " = " + (x / y));
        }

        scan.close();
    }
}
