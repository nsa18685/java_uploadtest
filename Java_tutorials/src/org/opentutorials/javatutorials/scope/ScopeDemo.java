package org.opentutorials.javatutorials.scope;

public class ScopeDemo {//유효범위=scope
	
	static void a(){
		int i=0; /*i라는 변수는 a의 매소드 외에서 이용되지 않음, 아래의 변수 i와는 다르게 작동함
					지역변수*/
	}
	
	public static void main(String[] args) {
		for(int i=0; i<5; i++){//이 곳 i 또한 위와는 다른 지역변수
			a();
			System.out.println(i);
		}

	}

}
