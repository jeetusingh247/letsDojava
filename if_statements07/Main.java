import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // if statement = performs a block of code if its condition is true.

        // int age = 65; // true

        boolean isIndianNational;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = in.nextLine();

        System.out.print("Enter your Age : ");
        int age = in.nextInt();

        System.out.print("Are you an Indian National (true/false) ? ");
        isIndianNational = in.nextBoolean();

        // GROUP 1
        if (name.isEmpty()) {
            System.out.println("Empty Name");
        }else {
            System.out.println("Hello " + name + "!");
        }

        // GROUP 2
        if(age >= 18 && age <= 70) {
            System.out.print("You are eligible to vote\nyou are an adult");
        }else if (age <= 0) {
            System.out.println("Invalid Age");
        }
         else {
            System.out.println("You are not eligible to vote");
        }

        System.out.println(); // to avoid newline spaces

        // GROUP 3

        if (isIndianNational) {
            System.out.println("You are Indian National");
        } else {
            System.out.println("You are not Indian National");
        }

        in.close(); // we don't need resources to be open
    }
}