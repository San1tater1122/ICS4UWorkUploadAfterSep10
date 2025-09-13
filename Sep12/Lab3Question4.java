package Sep12;

import java.util.Scanner;

public class Lab3Question4 {
    public static void main(String[] args) {
        // Write a program that takes a student's age and GPA as input.
        // Eligibility rules:
        // If age >= 18 and GPA >= 3.0 → 'Eligible for Scholarship'.
        // If GPA >= 3.5 but age < 18 → 'Special Scholarship Consideration'.
        // Otherwise → 'Not Eligible'.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        byte age = sc.nextByte();
        System.out.println("Please enter your GPA: ");
        float GPA = sc.nextFloat();

        if (age >= 18 && GPA >= 3.0){
            System.out.println("Eligible for Scholarship");
        }else if(GPA >= 3.5 && age < 18){
            System.out.println("Special Scholarship Consideration");
        }else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
