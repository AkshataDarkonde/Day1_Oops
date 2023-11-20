package Programs;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays to store student marks for subjects A, B, C
        int[][] marks = new int[3][3]; // 3 students and 3 subjects

        // Accepting marks for each student and subject
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (char) ('A' + j) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }

        // Calculating total and average score for each subject
        int[] subjectTotal = new int[3];
        double[] subjectAverage = new double[3];

        for (int j = 0; j < 3; j++) {
            int total = 0;
            for (int i = 0; i < 3; i++) {
                total += marks[i][j];
            }
            subjectTotal[j] = total;
            subjectAverage[j] = (double) total / 3;
            System.out.println("Total marks for Subject " + (char) ('A' + j) + ": " + subjectTotal[j]);
            System.out.println("Average marks for Subject " + (char) ('A' + j) + ": " + subjectAverage[j]);
        }

        // Calculating total and average score for each student
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            double average = (double) total / 3;
            System.out.println("Total marks for Student " + (i + 1) + ": " + total);
            System.out.println("Average marks for Student " + (i + 1) + ": " + average);
        }

        scanner.close();
    }
}
