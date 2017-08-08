package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a = "Hi";
	    String b = new String ("Hi");
	    
	    System.out.println(a==b); //눈에 보이는 것만으로 결론을 알 수 없음
	    System.out.println(a.equals(b)); //.equals라고 쓴다

	}

}
