
//Christopher Thompson
//CPSC 50100-001
//SU21
//Programming Assignment1 (Cipher)

import java.util.Scanner;
import java.util.Random;

public class Cipher {

	public static void main(String[] args) {
		
		//defining variables..... "plain" will serve as the unencoded number (sum of the 5 entries)
		int num1, num2, num3, num4, num5, plain=0;
		int key, tens, ones, onesCoded, tensCoded;
		
		
		//print assignment header
		System.out.println("Programming Fundamentals");
		System.out.println("Christopher Thompson");
		System.out.println("Programming Assignment 1");
		System.out.println();
		System.out.println("Welcome to the Cipher program.");
		
		
		//prompt user to input 5 integers in range 0-19;
		System.out.println("Please enter five numbers between 0 and 19");
		
		Scanner intscan = new Scanner(System.in);
		
		num1 = intscan.nextInt();
		if (num1>=0 && num1<=19)
			System.out.println("1st number: "+num1);
		else 
		{
			System.out.println("Please read the directions and try again!");
			System.exit(0);
		}
		
		num2 = intscan.nextInt();
		if (num2>=0 && num2<=19)
			System.out.println("2nd number: "+num2);
		else 
		{
			System.out.println("Please read the directions and try again!");
			System.exit(0);
		}
		
		num3 = intscan.nextInt();
		if (num3>=0 && num3<=19)
			System.out.println("3rd number: "+num3);
		else 
		{
			System.out.println("Please read the directions and try again!");
			System.exit(0);
		}
		
		num4 = intscan.nextInt();
		if (num4>=0 && num4<=19)
			System.out.println("4th number: "+num4);
		else 
		{
			System.out.println("Please read the directions and try again!");
			System.exit(0);
		}
		
		num5 = intscan.nextInt();
		if (num5>=0 && num5<=19)
			System.out.println("5th number: "+num5);
		else 
		{
			System.out.println("Please read the directions and try again!");
			System.exit(0);
		}
		
		//summation and place calculation steps
		plain = (num1 + num2 + num3 + num4 + num5);
		tens = (plain/10);
		ones = (plain%10);
		
		
		//encoding key random generation
		Random rand = new Random();
		key = rand.nextInt(10);
		
		
		//cipher calculation
		tensCoded = ((tens+key)%10);
		onesCoded = ((ones+key)%10);
		
		
		System.out.println();
		System.out.println("Total = "+plain);
		System.out.println("Your random key is "+key);
		System.out.println("Your encoded number is "+tensCoded+onesCoded);
		
		
		
	}

}
