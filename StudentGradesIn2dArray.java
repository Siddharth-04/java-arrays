import java.util.Scanner;

public class StudentGradesIn2dArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt(); //number of students input
        
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: "); 
			marks[i][0] = scanner.nextInt(); //input for physics marks
            System.out.print("Chemistry: "); 
			marks[i][1] = scanner.nextInt(); //input for chem marks
            System.out.print("Maths: "); 
			marks[i][2] = scanner.nextInt();//input for maths marks
            
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            
			//giving grades according to marks
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            }else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        
        System.out.println("Student Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " - Percentage: " + percentages[i] + "%, Grade: " + grades[i]);
        }
    }
}
