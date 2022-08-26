package Nesopackage;

import java.util.Scanner;

public class Ifstatment {

	public static void main(String[] args) {
		
		
		
	/*	int n =10;
		
		if (n>10)
		System.out.println(">10");
		
	else if (n==10)
				System.out.println("==10");
			else
				
				System.out.println("<10");
	}*/

		
		System.out.println("enter num1 op num2  (5*7): ");
		
		Scanner s = new Scanner (System.in);
		double d1 = s.nextDouble();
		char op = s.next().charAt(0);
		double d2 = s.nextDouble();
		
		if (op == '+')
			System.out.println((int)d1+d2);
		else if(op=='-')
			System.out.println((int)d1-d2);
		else if(op == '*')
			System.out.println((int)d1*d2);
		else 
			System.out.println("invalid programe");
		System.out.println("invalid programe");
		
		
}
	
}