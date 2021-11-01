import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number: ");
int n = scan.nextInt();
int f=1;
for(int i=1; i<=n; i++){
    if(n%i==0){
        f=f*i;
    }

}if(f==n){
            System.out.println("This is a prime number");
        }else {
            System.out.println("This is not prime number");
        }
    }
}
