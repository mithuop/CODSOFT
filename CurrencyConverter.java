import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double inrToUsd = 0.014; 
        double inrToEur = 0.012; 
        double inrToGbp = 0.011; 
        
        System.out.print("Enter the amount in INR: ");
        double amountInInr = scanner.nextDouble();
        
        System.out.println("Choose currency to convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double convertedAmount = 0.0;
        String targetCurrency = "";

        switch (choice) {
            case 1:
                convertedAmount = amountInInr * inrToUsd;
                targetCurrency = "USD";
                break;
            case 2:
                convertedAmount = amountInInr * inrToEur;
                targetCurrency = "EUR";
                break;
            case 3:
                convertedAmount = amountInInr * inrToGbp;
                targetCurrency = "GBP";
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.printf("%.2f INR is equal to %.2f %s%n", amountInInr, convertedAmount, targetCurrency);

        scanner.close();
    }
}
