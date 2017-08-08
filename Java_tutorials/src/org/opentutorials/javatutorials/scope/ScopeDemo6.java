package org.opentutorials.javatutorials.scope;


class C{
	int v=10;
	
	void m(){
		int v=20;
		System.out.println(v);//m에서 v변수의 값을 바꾸고 싶은 경우 다른 값으로 선언할 수 있음!
		System.out.println(this.v);//this는 전역변수를 의미함.
	}
}

public class ScopeDemo6 {

	public static void main(String[] args) {
		
		C c1=new C();
		c1.m();
	}

}
