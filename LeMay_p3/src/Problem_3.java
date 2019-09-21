import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Rate each category 1 - 10 (1 being least important and 10 being most important)\n");
		String[] topics = {"Rate how you feel about platformers: ","Rate how you feel about FPS's: ","Rate how you feel about Puzzle games: ","Rate how you feel about Board games: ","Rate how you feel about Card games:"};
		int[][] responses = new int[5][10];
		int response;
		char c = 'y';
		double average;
		int total = 0;
		int lowest;
		int lowestx = 0;
		int highest;
		int highestx = 0;
		int person = -1;
		int num;
		
		while(c != 'n')
		{
			person++;
			if(person == 10)
			{
				System.out.println("You have already entered 10 people.\n");
				break;
			}
			else
			{
				for(int i = 0; i < 5; i++)
				{
					System.out.println(topics[i]);
					num = scnr.nextInt();
					if(num > 10 || num < 1)
					{
						System.out.println("You entered a number that was between 1 and 10.\nProgram crashing.");
					}
					responses[i][num - 1]++; 
							
				}
				System.out.println("Would another person like to enter their ratings? (y/n)");
				System.out.println("Up to 10 people (you've entered " + (person + 1) + ")");
				c = scnr.next().charAt(0); 
			}
			
		}
		lowest = 100;
		highest = 0;
		average = 0;
		
		System.out.println("\t\t\t\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAverage");
		for(int i = 0; i < topics.length; i++)
		{	
			total = 0;
			average = 0;
			System.out.printf("%-40s",topics[i]);
			for(int j = 0; j < 10; j++)
			{
				System.out.print(responses[i][j]);
				System.out.print("\t");
				
				total = total + (responses[i][j] * (j+1));
			}
			average = (double)total / (person + 1);
			if(total < lowest)
			{
				lowest = total;
				lowestx = i;
			}
			if(total > highest)
			{
				highest = total;
				highestx = i;
			}
			System.out.print(average);
			System.out.println();
			
		}
		System.out.println("\nThe issue with the highest point total was \"" + topics[highestx] + "\" with " + highest + " points.");
		System.out.println("\nThe issue with the lowest point total was \"" + topics[lowestx] + "\" with " + lowest + " points.");
		
	}

}
