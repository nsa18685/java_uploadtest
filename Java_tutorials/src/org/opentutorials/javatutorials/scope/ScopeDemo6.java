package org.opentutorials.javatutorials.scope;


class C{
	int v=10;
	
	void m(){
		int v=20;
		System.out.println(v);//m���� v������ ���� �ٲٰ� ���� ��� �ٸ� ������ ������ �� ����!
		System.out.println(this.v);//this�� ���������� �ǹ���.
	}
}

public class ScopeDemo6 {

	public static void main(String[] args) {
		
		C c1=new C();
		c1.m();
	}

}
