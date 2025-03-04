import java.util.Scanner;

public class StoreOddEvenNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: "); 
        
        if (!scanner.hasNextInt()) { //if input is not a number (agar integer nahi hua)
            System.out.println("Error: Invalid input. Please enter a valid natural number.");
            System.exit(1);
        }
        
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Error: Please enter a natural number "); //if number is less than 1
            System.exit(1);
        }
        
        int[] evenNumbers = new int[number / 2 + 1]; //even number array
        int[] oddNumbers = new int[number / 2 + 1]; //odd number array
        int evenIndex = 0, oddIndex = 0;
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " "); //print odd array
        }
        System.out.println();
        
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " "); //print even array
        }
    }
}
