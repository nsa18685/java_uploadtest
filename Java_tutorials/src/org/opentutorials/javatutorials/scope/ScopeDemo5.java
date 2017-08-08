package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {//정적인(static scope,lexical scope) 유효범위!
	static int i=5;//전역변수 선언
	
	static void a(){
		int i=10;//지역변수 선언, 이는 a()매소드의 유효범위
		b();
	}
	
	static void b(){
		System.out.println(i); // 전역변수를 print함! b()의 지역변수 i가 없기 때문!(정적유효범위)
	}
	
	public static void main(String[] args) {
		a(); 
	}

}
