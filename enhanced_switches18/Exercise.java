import java.util.Scanner;

public class Exercise{
    public static void main(String[] args) {

        // --> Calculator Program Using Enhanced Switch <-- \\
        
        Scanner in = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        char again;
        
        do {
            boolean validOperation = true;

            System.out.print("Enter Num1 : ");
            num1 = in.nextDouble();
            System.out.print("Choose operator -> (+,-,*,/) : ");
            operator = in.next().charAt(0);
            System.out.print("Enter Num2 : ");
            num2 = in.nextDouble();

            switch(operator){
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                        validOperation = false;
                    }
                    else{
                        result = num1 / num2;
                    }
                }
                case '*' -> result = num1 * num2;
                default -> {
                    System.out.print("Invalid Operator");
                    validOperation = false;
                }

            }

            if (validOperation) {
                System.out.printf("Result is : %.2f", result);
            }

            System.out.print("\nWould You like to calculate again ? (y/n) ");
            again = in.next().charAt(0);

        }while(again == 'y' || again == 'Y');

        System.out.println("\nThanks for using calculator program");
    }
}