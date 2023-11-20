package Programs;

import java.util.Scanner;

public class taxprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double taxAmount = 0;

        // Checking income slabs and calculating tax based on the given conditions
        if (income <= 180000) {
            taxAmount = 0; // No tax
        } else if (income <= 300000) {
            taxAmount = (income - 180000) * 0.1; // 10% tax
        } else if (income <= 500000) {
            taxAmount = 12000 + (income - 300000) * 0.2; // 20% tax
        } else if (income <= 1000000) {
            taxAmount = 52000 + (income - 500000) * 0.3; // 30% tax
        }

        System.out.println("Tax payable: " + taxAmount);

        scanner.close();
    }
}
