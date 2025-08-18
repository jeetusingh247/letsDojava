import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // --> While Loop <-- \\
        
        Scanner in = new Scanner(System.in);

        // String name = "";

        // while(name.isEmpty()) {
        //     System.out.print("Enter your name : ");
        //     name = in.nextLine();
        // }

        // System.out.println("Hello " + name);

        // String response = "";

        // while (!response.equals("Q")) {
        //     System.out.println("You are playing a game");
        //     System.out.print("Press Q to quit : ");
        //     response = in.next().toUpperCase();
        // }

        // System.out.println("You quit the game");

        // Example do while

        int age;

        do {
            System.out.print("Enter your age : ");
            age = in.nextInt();
            if (age >= 18 && age <=100) {
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You are not eligible to vote");
            }
        }while(age != 0);

        in.close();
    }
}