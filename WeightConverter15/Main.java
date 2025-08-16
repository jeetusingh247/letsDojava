import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM
        Scanner in = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;
        char again;

        System.out.println("Welcome to the Weight Conversion Program");

        do {
            // PROMPT FOR USER CHOICE
            System.out.println("\n1: Convert lbs to kgs");
            System.out.println("2: Convert kgs to lbs");
            System.out.print("Choose an option : ");
            choice = in.nextInt();

            // OPTION 1: Convert lbs to kgs
            if (choice == 1) {
                System.out.print("Enter the weight in lbs : ");
                weight = in.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("The new weight in kgs is : %.2f\n", newWeight);
            }
            // OPTION 2: Convert kgs to lbs
            else if (choice == 2) {
                System.out.print("Enter the weight in kgs : ");
                weight = in.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("The new weight in lbs is : %.2f\n", newWeight);
            }
            // ELSE: Invalid choice
            else {
                System.out.println("Invalid Option");
            }

            // Ask if user wants to continue
            System.out.print("\nDo you want to convert again? (y/n): ");
            again = in.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("Thank you for using the Weight Conversion Program!");
        in.close();
    }
}
