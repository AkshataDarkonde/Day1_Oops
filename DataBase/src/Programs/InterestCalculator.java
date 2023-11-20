package Programs;

public class InterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time) {
        double amount = principal * Math.pow(1 + (rate / 100), time);
        return amount - principal;
    }

    public static void main(String[] args) {
        // Input values
        double principal = 1000; // Replace this with the principal amount
        double rate = 5; // Replace this with the interest rate
        double time = 2; // Replace this with the time period in years

        // Calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);

        // Calculate Compound Interest
        double compoundInterest = calculateCompoundInterest(principal, rate, time);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
