import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); //input of numbers
        
        int[] frequency = new int[10]; //initialise array
        
        while (number > 0) {
            int digit = number % 10; //counting frequency
            frequency[digit]++;
            number /= 10;
        }
        
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " frequency is : " + frequency[i]); //printing frequency
            }
        }
    }
}
