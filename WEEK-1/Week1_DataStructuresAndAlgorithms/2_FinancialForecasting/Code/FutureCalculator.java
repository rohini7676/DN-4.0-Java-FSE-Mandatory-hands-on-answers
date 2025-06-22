import java.util.Scanner;

public class FutureCalculator {

    public static double calculateForecast(double currentAmount, double rate, int years) {
        if (years == 0) {
            return currentAmount;
        }
        double updatedAmount = currentAmount * (1 + rate);
        return calculateForecast(updatedAmount, rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial amount: ");
        double initialAmount = input.nextDouble();

        System.out.print("Enter the expected annual increase (%): ");
        double percentageRate = input.nextDouble();
        double decimalRate = percentageRate / 100;

        System.out.print("Enter the number of years to forecast: ");
        int forecastYears = input.nextInt();

        double result = calculateForecast(initialAmount, decimalRate, forecastYears);

        System.out.printf("Estimated value after %d years: %.2f%n", forecastYears, result);
    }
}
