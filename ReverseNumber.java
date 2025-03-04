import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int num, index = 0;

        System.out.print("Enter a number: ");
        num = scanner.nextInt(); //input number

        int temp = num;
        while (temp > 0) { //while loop
            if (index == maxDigit) {
                maxDigit += 10;
                int[] newDigits = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    newDigits[i] = digits[i];
                }
                digits = newDigits;
            }
            digits[index++] = temp % 10;
            temp /= 10;
        }

        System.out.print("Reversed number: "); //printing reverse number
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        
        scanner.close();
    }
}
