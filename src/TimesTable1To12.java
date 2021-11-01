import java.util.Scanner;
public class TimesTable1To12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scan.nextInt();
        for (int i=1; i<=12; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
