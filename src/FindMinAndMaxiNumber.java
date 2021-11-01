import java.util.Scanner;
public class FindMinAndMaxiNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = scan.nextInt();
        System.out.println("Please enter the third number: ");
        int num3 = scan.nextInt();

        int max = Math.max(num1,num2);
                max= Math.max(max,num3);
        int min = Math.min(num1,num2);
        min= Math.min(min,num3);

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
