package org.opentutorials.javatutorials.condition;

public class Condition5Demo {

	public static void main(String[] args) {
		char op = '/';
		int a =20, b=10;
		switch(op)
		{case '*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		 case'/':
			System.out.println(a+"*"+b+"="+(a/b));
			break;
			default:
				System.out.println("*,/°¡ ¾Æ´Ô");
		}
	}
}
