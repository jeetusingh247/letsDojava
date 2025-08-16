import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double temp;
        String newTemp;
        String unit;
        char again;

        do {
            System.out.println("Enter the temperature : ");
            temp = in.nextDouble();

            System.out.print("Convert to celcius or fahrenheit? (C or F) : ");
            unit = in.next().toUpperCase();

            newTemp = unit.equals("C") 
                ? String.valueOf((temp - 32) * 5 / 9) 
                : unit.equals("F") 
                    ? String.valueOf((temp * 9 / 5) + 32) 
                    : "Invalid Unit Conversion";

            if (newTemp.equals("Invalid Unit Conversion")) {
                System.out.println(newTemp);
            } else {
                System.out.printf("Converted Temperature: %.1f°%s%n", Double.parseDouble(newTemp), unit);
            }

            System.out.print("Do you want a new conversion : (y/n) ? ");
            again = in.next().charAt(0);
        
        } while (again == 'y' || again == 'Y');

        System.out.println("Thanks for using our program :-)");

        in.close();

    }
}
