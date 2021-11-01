import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scan.nextInt();
        int sum = 0;
        //executes until the condition returns true
        for (int i=1; i<=num; i++){
            //adding the value of i into sum variable
            sum = sum+i;
        }
        //prints the sum
        System.out.println("Sum of natural n number is: " + sum);
    }
}
