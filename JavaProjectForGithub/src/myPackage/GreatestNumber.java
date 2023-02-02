package myPackage;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b) {
			System.err.println("Number "+a+" is greater");
		}
		else
		{
			System.out.println("Number "+b+" is greater");
		}
	}

}
