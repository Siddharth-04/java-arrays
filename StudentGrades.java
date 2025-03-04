import java.util.Scanner;

public class StudentGrades{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: "); 
			physics[i] = scanner.nextInt();
            System.out.print("Chemistry: "); 
			chemistry[i] = scanner.nextInt();
            System.out.print("Maths: "); 
			maths[i] = scanner.nextInt();
            
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        
        System.out.println("Student Results:");
		
        for (int i = 0; i < numStudents; i++){
            System.out.println("Student " + (i + 1) + " - Percentage: " + percentages[i] + "%, Grade: " + grades[i]);
        }
    }
}
