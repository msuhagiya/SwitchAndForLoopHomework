import java.util.Scanner;
public class PrintReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num ;
        int reversNum = 0;
        System.out.println("Please enter your number: ");
        num=scan.nextInt();//This statement will print the user input

       // for loop: No initialization part as num is already * initialized and no increment/decrement part as logic * num = num/10 already decrements the value of num

        for(;num!=0;){
            reversNum=reversNum*10;
            reversNum=reversNum+num%10;
            num=num/10;
        }
        System.out.println("Reverse of given number is : " + reversNum);
    }
}
