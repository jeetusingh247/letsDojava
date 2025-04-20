import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // SHOPPING CART PROGRAM
        Scanner in = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What would you like to have ? : ");
        item = in.nextLine();

        System.out.print("What is the price for each ? : ");
        price = in.nextDouble();

        System.out.print("How many would you like ? : ");
        quantity = in.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        in.close();

    }
}