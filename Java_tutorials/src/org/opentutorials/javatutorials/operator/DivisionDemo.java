package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b);  //������ ��� �Ǽ� 0.333..�� miss��!
		System.out.println(c/d);
		
		System.out.println(a/d);
		System.out.println(c/b);
	}

}
