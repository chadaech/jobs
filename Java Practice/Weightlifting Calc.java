import java.util.Scanner;


public class MaxBenchPress {
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter your current Bench 1RM (in LBS)");
			double weight = scanner.nextDouble();

			System.out.print("Enter the number of Reps you can currently preform with previous stated weight");
			int reps = scanner.nextInt();

			double oneRepMax = weight * (1 + (reps / 30.0));
			System.out.println("Your estimated 1RM is " + oneRepMax + "lbs.");

		}
}
	
