import java.util.Scanner;

class FindYoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
		
		//taking input of Amar Akbar and Anthony
        for (int i = 0; i < 3; i++) {
            if (i == 0)
                System.out.print("Enter age and height of Amar : ");
            else if (i == 1)
                System.out.print("Enter age and height of Akbar : ");
            else
                System.out.print("Enter age and height of Anthony : ");
            ages[i] = scanner.nextInt();
            heights[i] = scanner.nextDouble();
        }

        // Finding tallest
		int youngestIndex = 0;
		int tallestIndex = 0;
		double maxHeight = 0;
		int minAge = 1234567;
		
		for(int i=0 ; i<3 ; i++){
			if(minAge > ages[i]){
				minAge = ages[i];
				youngestIndex = i;
			}
			if(maxHeight < heights[i]){
				maxHeight = heights[i];
				tallestIndex = i;
			}
		}
		
		for(int i=0 ; i<3 ; i++){
			System.out.println("Age : " + ages[i] + ",Height : " + heights[i]);
		}

        String[] names = {"Amar", "Akbar", "Anthony"};

        System.out.println(names[tallestIndex] + " is tallest");
        System.out.println(names[youngestIndex] + " is youngest");
    }
}
