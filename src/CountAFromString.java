import java.util.Scanner;
public class CountAFromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your string: " + " ");
        String str = scan.nextLine();
        int count=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='a'|| str.charAt(i)=='A')
                count++;

        }
        System.out.println("Total number of 'a' in string : " + count);
    }
}
