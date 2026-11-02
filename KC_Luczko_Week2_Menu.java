import java.util.Scanner;

public class KC_Luczko_Week2_Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int choice = 0;
        boolean hasNumbers = false;

        while (choice != 5) {
            System.out.println();
            System.out.println("1 - Enter two (2) numbers (x and y).");
            System.out.println("2 - Print all numbers between x and y.");
            System.out.println("3 - Find the average of all numbers between x and y.");
            System.out.println("4 - Find all prime numbers between x and y.");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice >= 2 && choice <= 4 && !hasNumbers) {
                System.out.println("Please enter two numbers first.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter x: ");
                    x = input.nextInt();
                    System.out.print("Enter y: ");
                    y = input.nextInt();

                    if (x > y) {
                        int temp = x;
                        x = y;
                        y = temp;
                    }
                    hasNumbers = true;
                    break;

                case 2:
                    System.out.print("Numbers between " + x + " and " + y + ": ");
                    for (int i = x; i <= y; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int sum = 0;
                    int count = 0;
                    for (int i = x; i <= y; i++) {
                        sum += i;
                        count++;
                    }
                    double average = (double) sum / count;
                    System.out.println("Average: " + average);
                    break;

                case 4:
                    System.out.print("Prime numbers between " + x + " and " + y + ": ");
                    boolean found = false;
                    for (int i = x; i <= y; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + " ");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.print("none");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please pick 1-5.");
            }
        }

        input.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
