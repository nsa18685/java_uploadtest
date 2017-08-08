package org.opentutorials.javatutorials.scope;

public class ScopeDemo3 {
	static void a(){
		String title="coding dverybody";
	}
	
	public static void main(String[] args) {
		a();
		//System.out.println(title); a매소드 안에 title이 존재하기때문에 메인에서는 존재하지 않는 것으로 생각함!

	}

}
