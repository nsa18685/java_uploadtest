package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {//������(static scope,lexical scope) ��ȿ����!
	static int i=5;//�������� ����
	
	static void a(){
		int i=10;//�������� ����, �̴� a()�żҵ��� ��ȿ����
		b();
	}
	
	static void b(){
		System.out.println(i); // ���������� print��! b()�� �������� i�� ���� ����!(������ȿ����)
	}
	
	public static void main(String[] args) {
		a(); 
	}

}
