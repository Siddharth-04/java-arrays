import java.util.Scanner;

public class CheckElementsOfArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number :");
            numbers[i] = scanner.nextInt(); //input
        }
        
        for (int i=0 ; i < numbers.length ; i++) {
			int num  = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is a positive even number.");
                } else {
                    System.out.println(num + " is a positive odd number.");
                }
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
        
        if (numbers[0] > numbers[4]) { //first and last comparison
            System.out.println("First number is greater than last number.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First number is less than last number.");
        } else {
            System.out.println("First number is equal to last number.");
        }
        
        scanner.close();
    }
}
