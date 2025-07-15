import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        // HYPOTENUSE c = Math.sqrt(a sqr + b sqr);

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the perpendicular : ");
        double a = in.nextDouble();
        System.out.print("Enter the base : ");
        double b = in.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("HYPOTENUSE : " + c);

        in.close();



    }
}