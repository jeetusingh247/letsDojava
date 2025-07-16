

public class Main {
    public static void main(String[] args) {
        
        // printf() = is a method used to format the output

        // %[flags][width][.precision][specifier-character]

        // String name = "Spongebob";
        // char firstletter = 'S';
        // int age = 30;
        // double height = 60.5;
        // boolean isEmployed = true;

        // System.out.printf("Hello %s\nYour first letter --> %c\nYour age is --> %d\nYour height is %.1f\nEmployed : %b\n", name, firstletter, age, height, isEmployed);

        // --> Precision <-- \\
        // double price1 = 90000.99;
        // double price2 = 1000000.289;
        // double price3 = -5400.389;

        // System.out.printf("% .2f\n", price1); // 2 --> decimal
        // System.out.printf("% .3f\n", price2); // 3 --> decimal
        // System.out.printf("% .1f\n", price3); // 1 --> decimal

        // + = output a log
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive


        // --> WIDTH <-- \\

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 3;
        int id3 = 99;

        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id3); 

    }
}