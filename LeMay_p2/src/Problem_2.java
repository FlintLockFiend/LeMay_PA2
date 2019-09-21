import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double weight;
		double height;
		String units;
		double BMI = 0;
		
		System.out.println("Enter Imperial for Imperial units or Metric for Metric units: ");
		units = scnr.next();
		
		if(units.contentEquals("Imperial"))
		{
			System.out.println("Please enter your weight in pounds: ");
			weight = scnr.nextDouble();
			System.out.println("Please enter your height in inches: ");
			height = scnr.nextDouble();
			
			BMI = (703 * weight) / (Math.pow(height, 2));
		}
		else if(units.contentEquals("Metric"))
		{
			System.out.println("Please enter your weight in kilograms: ");
			weight = scnr.nextDouble();
			System.out.println("Please enter your height in meters: ");
			height = scnr.nextDouble();
			
			BMI = weight / (Math.pow(height, 2));
		}
		else
		{
			System.out.println("You did not enter Imperial or Metric.");
		}
		
		System.out.printf("Your have a BMI of " + String.format("%.2f", BMI) + "\n");
		System.out.println("\nUnderweight is a BMI less than 18.5.");
		System.out.println("Normal Weight is a BMI between 18.5 and 24.9.");
		System.out.println("Overweight is a BMI between 25 and 29.9.");
		System.out.println("Obesity is a BMI of 30 or larger.");
	}

}
