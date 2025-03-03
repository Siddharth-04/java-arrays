import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); //input number
        int[] table = new int[10]; //array declare and initialise
        
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1); //manipualtion
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]); //print
        }
    }
}
