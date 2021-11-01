//Java Program to find the Factorial of a Number
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Take input from the user
        //Create an instance of the Scanner Class
        System.out.println("Please enter the number: ");
        int n = scan.nextInt(); //Declare and Initialize the variable
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of the number: " + fact);
    }
}
