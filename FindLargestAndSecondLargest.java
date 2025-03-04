import java.util.Scanner;

public class FindLargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: "); //input number
        int number = scanner.nextInt();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; //diving number and taking single digits are storing in array
            number /= 10;
            index++;
        }
        
        if (index == 0) {
            System.out.println("No digits entered.");
            System.exit(1);
        }
        
        int largest = -1234567;
        int secondLargest = -1234567;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest digit: " + largest);
        if (secondLargest == -1234567) {
            System.out.println("No second largest digit.");
        } else {
            System.out.println("Second largest digit: " + secondLargest); //printing largest and second largest
        }
    }
}
