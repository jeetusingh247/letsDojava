import java.util.Scanner;
import java.math.*;

public class Exercise2 {
    public static void main(String[] args) {
        
        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        double radius = in.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference : %.1f\n", circumference);
        System.out.printf("Area : %.1fcm²\n", area);
        System.out.printf("volume : %.1f³\n", volume);


        in.close();
    }
}