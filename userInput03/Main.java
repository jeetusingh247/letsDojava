import java.util.Scanner; // Scanner is a class

public class Main {
    
    public static void main(String[] args) {

        // scanner is an object that allows to accept user input in java

        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name : ");
        // String name = scanner.nextLine(); // reads string of char including space
        // // String name = scanner.next(); // reads string of char without spaces
        // System.out.print("Enter Age : ");
        // int age = scanner.nextInt(); // for integer type input

        // System.out.print("What is you score : ");
        // double score = scanner.nextDouble(); // for double type

        // System.out.print("Are you a student? (true/false) : ");
        // boolean isStudent = scanner.nextBoolean(); // true or false

        // System.out.println("Hello : " + name);
        // System.out.println("Your Age is : " + age);
        // System.out.println("Your Score is : " + score);

        // if (isStudent) {
        //     System.out.println("Welcome " + name);
        // }else {
        //     System.out.println("You are not allowed " + name);
        // }

        // COMMON ISSUES
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        // FIX is : add onemore scanner.nextLine()
        scanner.nextLine();

        System.out.print("Enter your favourite color : ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("you like " + color);
        scanner.close();
        
    }
}
