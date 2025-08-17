import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // --> LOGICAL OPERATOR <-- \\
        
        // && = AND
        // || =  OR
        // ! = NOT

        // USING --> AND, OR, !

        // double temp = -10;
        // boolean isSunny = false;

        // if (temp >= 0 && temp <=30 && isSunny) {
        //     System.out.println("Temperature lies in range (0-30)");
        //     System.out.println("It is Sunny Outside");
        // }else if (temp >= 0 && temp <=30 && !isSunny){
        //     System.out.println("Temperature lies in range (0-30)");
        //     System.out.println("It is Cloudy Outside");
        // }else if (temp > 30 || temp < 0) {
        //     System.out.println("The weather is bad");
        // }

        // EXAMPLE

        Scanner in = new Scanner(System.in);

        String username;

        System.out.print("Enter your new Username : ");
        username = in.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 - 12 characters");
        }else if (username.contains(" ") || username.contains("_" ) || username.contains("@")) {
            System.out.println("Username should not have space, underscore and @");
        }
        else{
            System.out.println("Welcome " + username);
        }

        in.close();


    }
}