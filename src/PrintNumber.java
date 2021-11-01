import java.util.Scanner;
public class PrintNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int num1= scan.nextInt();
        System.out.println("Enter the exit number: ");
        int num2 = scan.nextInt();// enter second number of range
        int count=0;
        if (num1<=num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
                count++;
                if (count == 10) {

                    break;
                }
            }
        }else

        {
            System.out.println("Invalid range:");
        }
    }

}
