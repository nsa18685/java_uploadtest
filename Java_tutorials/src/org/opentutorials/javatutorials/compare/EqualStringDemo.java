package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a = "Hi";
	    String b = new String ("Hi");
	    
	    System.out.println(a==b); //���� ���̴� �͸����� ����� �� �� ����
	    System.out.println(a.equals(b)); //.equals��� ����

	}

}
