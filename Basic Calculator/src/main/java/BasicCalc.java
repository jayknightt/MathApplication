import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first number: ");
double num1 = scanner.nextDouble();

System.out.print("Enter the second number: ");
double num2 = scanner.nextDouble();

System.out.println("Possible calculations:");
System.out.println("(A)dd");
System.out.println("(S)ubtract");
System.out.println("(M)ultiply");
System.out.println("(D)ivide");



System.out.print("Please select an option: ");
char selectedOption = scanner.next().charAt(0);



if ("(A)dd") {
System.out.println("You selected addition.");
double result;
 result = num1 + num2;
 System.out.println(num1 + " + " + num2 + " = " + result);

else if (isSubtraction) {
    System.out.println("You selected subtraction.");
result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);

else if (isMultiplication) {
    System.out.println("You selected multiplication.");
result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);

if (isDivision) {
  System.out.println("You selected division.");
if (num2 != 0) {
result = num1 / num2;
System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("");
            }
            break;
        default:
            System.out.println("Invalid option. Please select A, S, M, or D.");
    }

    scanner.close();
}
    }

