import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        
        // --> Find Largest Number Out of three<-- \\
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number a, b, c : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // if (a == b) {
        //     if (b == c) {
        //         System.out.println("Invalid Input, Please enter different numbers");
        //     }
        // }

        if (a > b) {
            if (a > c) {
                System.out.println("a is largest");
            }else{
                System.out.println("b is largest");
            }
        }else if (b > a) {
            if (b > c) {
                System.out.print("b is largest");
            }else{
                System.out.print("c is largest");
            }
        }else{
            System.out.println("Numbers should not be identical");
        }

        // System.out.print("Invalid Input Try Again");

        in.close();
    }
}