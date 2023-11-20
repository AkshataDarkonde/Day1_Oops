package Programs;

public class Armstrongno100to999 {
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {
            int n = num;
            int count = 0;
            int sum = 0;

            while (n > 0) {
                count++;
                n = n / 10;
            }

            n = num; // Reset n to the original number

            while (n > 0) {
                int r = n % 10;
                sum += Math.pow(r, count);
                n = n / 10;
            }

            if (num == sum) {
                System.out.println("The number " + num + " is an Armstrong number");
            }
        }
    }
}
