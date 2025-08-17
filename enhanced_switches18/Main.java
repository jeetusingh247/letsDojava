import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Enhanced Switch = A replacement to many else-if statements
        //                 = it is a Java14 feature

        Scanner in = new Scanner(System.in);

        char again;

        do {
            System.out.print("Enter the day : ");
            String day = in.next();
            // in.nextLine();
            switch(day){
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.print("WeekDay :-(");
                case "Saturday","Sunday" -> System.out.print("Weekend :-)");
                default -> System.out.print("Not a day");
            }

            System.out.print("\nCheck Again --> (y/n) ? : ");
            again = in.next().charAt(0);
        }while(again == 'y' || again == 'Y');
        
        System.out.println("Thanks for using the day checker");

        in.close();
    }
}
