import java.util.Scanner;
public class SumOfXRangeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //User input starting number of range
        System.out.println("Please enter starting number: ");
        int num1 = scan.nextInt();
        //user input ending number of range
        System.out.println("Please enter ending number: ");
        int num2 = scan.nextInt();
        int sum=0;
        for (int i=num1; i<=num2; i++ ){
            sum=sum+i; //sum of range
        }
        System.out.println("Sum of x range number is: " + sum);
    }
}
