package org.opentutorials.javatutorials.method;

public class ReturnDemo {
	 public static int one() {
	        return 1;
	        return 2;
	        return 3;
	    }//first return의 값을 반환하면서 메소드를 완전히 멈춤, 2,3은 return하지 않음
	 
	    public static void main(String[] args) {
	        System.out.println(one());
	    }
	
}
