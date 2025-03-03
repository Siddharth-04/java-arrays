import java.util.Scanner;

public class MultiplicationTableOfANumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); //input number
        int[] multiplicationResult = new int[4]; //array declare
        
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        
        System.out.println("Multiplication table from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]); //print
        }
    }
}
