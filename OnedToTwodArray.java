import java.util.Scanner;

class OnedToTwodArray{
	public static void main(String [] args){
		Scanner scanner  = new Scanner(System.in);
		
		System.out.print("Enter number of rows : ");
		int rows = scanner.nextInt();
		System.out.print("Enter number of columns : ");
		int columns  = scanner.nextInt();
		
		int [] onedArray = new int[rows*columns];
		
		System.out.print("Enter array elements : ");
		
		for(int i=0 ; i<rows*columns ; i++){
			onedArray[i] = scanner.nextInt(); //one D array elements input 
		}
		
		int[][] twodArray = new int[rows][columns];
		
		int index = 0;
		
		for(int i=0 ; i<rows ; i++){
			for(int j=0 ; j<columns ; j++){
				twodArray[i][j] = onedArray[index++]; //converting elements
			}
		}
		
		System.out.println("2-D Array : ");
		for(int i=0 ; i<rows ; i++){
			for(int j=0 ; j<columns ; j++){
				System.out.print(twodArray[i][j] + " "); //printing 2d array
			}
			System.out.println();
		}
		
	}
}