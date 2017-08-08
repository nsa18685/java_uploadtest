package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		  int i = 3;
	        i++;
	        System.out.println(i); // i+1= 4 출력, +i=양수 3을 뜻함
	        ++i;
	        System.out.println(i); // 5 출력
	        System.out.println(++i); // 6 출력
	        System.out.println(i--); // 6 출력
	        System.out.println(i); // 5 출력
	}

}
