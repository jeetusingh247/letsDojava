import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        
        // --> Largest Among 4 Numbers <-- \\
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 4 Non Identical Integers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();

        int largest;

        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    largest = num1;
                } else {
                    largest = num4;
                }
            } else { // num3 >= num1
                if (num3 > num4) {
                    largest = num3;
                } else {
                    largest = num4;
                }
            }
        } else { // num2 >= num1
            if (num2 > num3) {
                if (num2 > num4) {
                    largest = num2;
                } else {
                    largest = num4;
                }
            } else { // num3 >= num2
                if (num3 > num4) {
                    largest = num3;
                } else {
                    largest = num4;
                }
            }
        }

        System.out.printf("%d is largest among %d, %d, %d and %d\n", largest, num1, num2, num3, num4);
        in.close();
    }
}
