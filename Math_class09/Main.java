import java.math.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Value of  PI is : " + Math.PI);
        System.out.println("Value of Eulers Number : " + Math.E);
        
        double result;

        // result = Math.pow(2, 8);
        // result = Math.abs(-5); // abs means absolute value
        result = Math.sqrt(9);
        result = Math.round(1.7); // rounds off value
        result = Math.ceil(9.11); // gives ceiling, rounds up
        result = Math.floor(9.11); // gives floor, rounds down
        result = Math.max(12,10); // returns MAX
        result = Math.min(12, 10); // return MIN

        // System.out.println("2^8 is : " + result);
        System.out.println(result);

    }
}