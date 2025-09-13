package Sep12;

import java.util.Scanner;

public class Lab3Question3 {
    public static void main(String[] args){
        // Design a program that simulates an online store checkout.
        // The user chooses a product category (Electronics, Clothing, or Books).
        // Use a switch statement to assign a base price.
        // Then apply discounts: Electronics 10%, Clothing 20%, Books 5%.
        // Print the final price after discount.

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a product category:");
        System.out.println("1 -> Electronics");
        System.out.println("2 -> Clothing");
        System.out.println("3 -> Books");
        String choice = sc.nextLine();

        float basePrice = 0;
        float discountRate = 0;

        switch (choice) {
            case "1":
                basePrice = 400;
                discountRate = 0.10f;
                break;
            case "2":
                basePrice = 200;
                discountRate = 0.20f;
                break;
            case "3":
                basePrice = 100;
                discountRate = 0.05f;
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
                return;
        }
        System.out.println("Success!");

        float finalPrice = basePrice - (basePrice * discountRate);

        System.out.println("Base Price: $" + basePrice);
        System.out.println("Discount: " + (discountRate * 100) + "%");
        System.out.println("Final Price after discount: $" + finalPrice);
    }
}
