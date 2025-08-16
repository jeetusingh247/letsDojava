
public class Main {

    public static void main(String[] args) {
        
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        String passOrfail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrfail);

        int num = 3;

        String evenOrodd = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrodd);

        // TERNARY --> ALTERNATIVE TO IF-ELSE STATEMENT

        // if(score >= 60){
        //     System.out.println("PASS");
        // }else{
        //     System.out.println("FAIL");
        // }
    }
}