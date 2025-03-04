import java.util.Scanner;
import java.util.Arrays;

public class FindLargestAndSecondLargest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxDigit = 10;
        int[] digits = new int[maxDigit]; //array intialise
        int num, index = 0;

        System.out.print("Enter a number: ");
        num = scanner.nextInt(); //input number

        while (num > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }
            digits[index++] = num % 10;//taking number digit by digit
            num /= 10;
        }

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
		
		//printing output

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
