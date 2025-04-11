// package variables02;

public class Main {
    public static void main(String[] args) {

        // variable = a reusable container for a value
        //            a varibale behaves if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that point to the (heap)

        // Primitive vs Reference
        // --------     ---------
        //   int          string
        //   double       array
        //   char         object
        //   boolean  
        
        // 2 Steps to creating a variable
        // -----------------------------
        // 1. declaration
        // 2. assignment

        int age = 22; // declaration & assignment
        int year = 2025; 
        int quantity = 1;
        // System.out.println("My age is : "+age); // print age
        // System.out.print("The year is : "+year+"\n"); // print age
        // System.out.print("Quantity is : "+quantity+"\n"); // print age

        double price = 19;
        double gpa = 3.5;
        double temperature = -12.5;
        // System.out.println("Price is : " + price);
        // System.out.println("GPA is : " + gpa);
        // System.out.println("Temperature is : " + temperature);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        // System.out.println("Grade is : " + grade);
        // System.out.println("Symbol is : " + symbol);
        // System.out.println("Currency is : " + currency);

        boolean isStudent = true; // camelcase
        boolean forSale = false;
        boolean isOnline = true;
        // System.out.println("Are we a student ? : " + isStudent);
        // System.out.println("Are we for sale ? : " + forSale);
        // System.out.println("Are we online ? : " + isOnline);

        String fname = "John";
        String lname = "Doe";
        String food = "Shaahi Paneer";
        String email = "johndoe1111@gmail.com"; // string are series of characters
        System.out.println("first name : "+ fname + " , last name : " + lname);
        System.out.println(fname + " " + lname + " loves " + food); // string concatenation
        System.out.println("Email is : " + email);



    }
}
