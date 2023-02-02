package myPackage;

import java.util.Scanner;

public class SimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("The addition is: "+c);
		
		
	}

}
