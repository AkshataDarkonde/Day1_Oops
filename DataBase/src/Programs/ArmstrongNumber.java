package Programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int a = n;
        int b = n;
        int count = 0;
        int sum = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        while (a > 0) {
            int r = a % 10;
            sum += Math.pow(r, count);
            a = a / 10;
        }

        if (b == sum) {
            System.out.println("The given number " + b + " is an Armstrong number");
        } else {
            System.out.println("The given number " + b + " is not an Armstrong number");
        }

        scanner.close();
    }
}
