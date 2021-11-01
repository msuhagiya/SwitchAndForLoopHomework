public class NumberDividedBy3And5 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 100;
        System.out.println("Number divided by 3: ");
        //checking the number is divided by 3
        for (int i = num1; i<=num2; i++){
            if(i%3==0){
                System.out.print(i + ",");
            }
            }
        System.out.println();
        System.out.println("Number divided by 5: ");
        //checking the number is divided by 5
        for (int i = num1; i<=num2; i++){
            if (i%5==0){
                System.out.print(i + ",");
        }
        }
        System.out.println();
        System.out.println("Number divided by 3 and 5 are: ");
        //checking the number is divided by 3 and 5
        for (int i =num1; i<=num2; i++){
            if (i%3==0 && i%5==0){
                System.out.print(i + ",");
            }
        }

    }
}
