import java.util.Scanner;

public class Encrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input;
		int num1;
		int num2;
		int num3;
		int num4;
		
		System.out.println("Enter your 4 digit integer to encrypt:");
		input = scnr.nextInt();
		
		num1 = input / 1000;
		num2 = (input / 100) % 10;		
		num3 = (input / 10) % 10;		
		num4 = input % 10;
		
		num1 = encrypt(num1);
		num2 = encrypt(num2);
		num3 = encrypt(num3);
		num4 = encrypt(num4);
		
		System.out.println("Your encrypted integer: ");
		System.out.print(num3);
		System.out.print(num4);
		System.out.print(num1);
		System.out.println(num2);
		
	}
	
	private static int encrypt(int x) {
		x = (x + 7) % 10;
		return x;
	}
	
}
