import java.util.Scanner;

public class FindFactorsAndStoreInArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); //input number
        
        int[] factors = new int[10]; //max 10 factors
        int index = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        
        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " "); //print factors
        }
    }
}
