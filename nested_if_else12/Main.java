
public class Main {
    public static void main(String[] args) {
        
        // --> NESTED IF-ELSE STATEMENTS <-- \\

        boolean isStudent = false;
        boolean isSenior = false;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You are student & senior, you get 30% discount");
                price *= 0.7;
            }else{
                System.out.println("You get a discount of 10%");
                price *= 0.9;
            }
        }else{
            if (isSenior) {
                System.out.println("Discount is only 20%");
                price *= 0.8;
            }else{
              price *= 1;
            }
        }
         
        System.out.printf("The price of a ticket is : Rs. %.2f", price);
    }    
}