import java.util.Scanner;

public class BmiCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt(); //input number of persons
        
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble(); //input height
            
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble(); //input weight
            
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 24.9 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i]>= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        System.out.println("Person Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Height,weight,bmi and status of person " + i + " : " + heights[i] +" , "+ weights[i]+ ","+ bmi[i]+ ","+ status[i]);
        }
    }
}
