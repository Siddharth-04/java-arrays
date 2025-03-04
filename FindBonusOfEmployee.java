import java.util.Scanner;

class FinfBonusOfEmployee{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		//array initialisation
		double [] oldSalary = new double[10];
		int [] serviceYears = new int [10];
		
		double [] newSalary = new double[10];
		double [] newBonus = new double[10];
		
		for(int i=0 ; i<10 ; i++){
			System.out.print("Please enter salary and years of service of employee " + (i+1) + " : ");
			double salary = scanner.nextDouble();
			int years = scanner.nextInt();
			
			if(salary < 0 || years < 0){
				System.out.print("Please enter a valid value !");
				i--;
			}
			else{
				oldSalary[i]= salary;
				serviceYears[i] = years;
			}
		}
		
		for(int i=0 ; i<10 ; i++){
			if(serviceYears[i] >= 5){
				newBonus[i] = (oldSalary[i]/100)*5; //calculate bonus for more than 5 years of service
				newSalary[i] = oldSalary[i] + newBonus[i];
			}
			else{
				newBonus[i] = (oldSalary[i]/100)*5; //for less than 5 years of service
				newSalary[i] = oldSalary[i] + newBonus[i];
			}
			
		}
		
		for(int i=0 ; i<10 ; i++){ //print bonus and salary
			System.out.println("Total Bonus Payout : " + newBonus[i] + ",oldSalary was : " + oldSalary[i] + ", new salary will be : "+ newSalary[i]);
		}
		
	}
}