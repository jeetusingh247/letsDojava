// package userInput03;
import java.util.Scanner;

// calculate area of rectangle

public class AreaRectangle {
    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Width : ");
        width = in.nextDouble();
        System.out.print("Enter height : ");
        height = in.nextDouble();

        area = width * height;

        System.out.println("Area is : " + area + "cm2");

        in.close();

    }
}
