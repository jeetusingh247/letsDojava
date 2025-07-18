import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // .substring() = A method used to extract a portion of a string.
        //              = for example : .substring(start, end).
        //              = start, end is portion where substring is present in super script.

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your email : ");
        String email = in.nextLine();

        // String email = "parmatma@email.com";
        // String username = email.substring(0, 8);
        // String emailType = email.substring(9, 14);
        // String domainType = email.substring(15, 18);
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Email is : " + email);
        System.out.println("Username is : " + username);
        // System.out.println("Type of email : " + emailType);
        System.out.println("Type of domain is : " + domain);

    }
}