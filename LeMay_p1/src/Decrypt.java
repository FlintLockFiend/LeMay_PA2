import java.util.Scanner;

public class Decrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int input;
		int num1;
		int num2;
		int num3;
		int num4;
		
		System.out.println("Enter your 4 digit encrypted integer to decrypt:");
		
		input = scnr.nextInt();
		num1 = (input / 10) % 10;
		num2 = input % 10;
		num3 = input / 1000;
		num4 = (input / 100) % 10;
		
		num1 = decrypt(num1);
		num2 = decrypt(num2);
		num3 = decrypt(num3);
		num4 = decrypt(num4);
		
		System.out.println("Your decrypted integer: ");
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);
		System.out.println(num4);
		
	}
	
	private static int decrypt(int x) {
		if(x >= 7)
		{
			x = x - 7;
		}
		else
		{
			x = (x + 10) - 7;
		}
		return x;
		
	}
}
