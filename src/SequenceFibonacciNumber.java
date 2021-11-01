import java.util.Scanner;
public class SequenceFibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int prv=0; //start with 0
       int next= 1;
        System.out.println("Please enter any number:  ");
        int n = scan.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(prv+ " ");
            int ans = prv+next;
            prv = next;
            next=ans;
        }
    }
}
