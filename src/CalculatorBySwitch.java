import java.util.Scanner;
 class CalculatorBySwitch {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int num1, num2,sum,sub,multi,div;
   char operator;
   System.out.println("Please enter your first number: ");
   num1 = scan.nextInt();
   System.out.println("Please enter your second number: ");
   num2 = scan.nextInt();
   System.out.println("Please enter your operator: ");
   operator = scan.next().charAt(0);
   switch (operator){
    case '+': sum = num1+num2;
     System.out.println("Sum is: " + sum);break;
    case '-': sub = num1-num2;
     System.out.println("Sub is: " + sub);break;
    case '*': multi = num1*num2;
     System.out.println("Multi is: " + multi);break;
    case '/': div = num1/num2;
     System.out.println("Division is: " + div);break;
    default:
     System.out.println("Invalid operator");
   }
  }
}
