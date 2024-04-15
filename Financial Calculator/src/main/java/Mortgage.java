import java.util.Scanner;

public class Mortgage {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

 // Get user input
System.out.print("Enter principal amount: ");
double principal = scanner.nextDouble();

System.out.print("Enter annual interest rate (in percentage): ");
double annualInterestRate = scanner.nextDouble();
double monthlyInterestRate = annualInterestRate / 100 / 12;

System.out.print("Enter loan length (in years): ");
int years = scanner.nextInt();
int months = years * 12;

// Calculate monthly payment
    double monthlyPayment = principal * monthlyInterestRate /
                    (1 - Math.pow(1 + monthlyInterestRate, -months));

// Calculate total payment
            double totalPayment = monthlyPayment * months;
            double totalInterest = totalPayment - principal;

// Display results
            System.out.println("\nMonthly Payment: $" + String.format("%.2f", monthlyPayment));
            System.out.println("Total Interest Paid: $" + String.format("%.2f", totalInterest));

            scanner.close();
        }
    }


