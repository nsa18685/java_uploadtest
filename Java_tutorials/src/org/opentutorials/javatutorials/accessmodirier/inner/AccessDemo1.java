package org.opentutorials.javatutorials.accessmodirier.inner;
class A{
	public String y(){
		return"public void y()";
	}
	private String z(){
		return "public void z()";
	}
	
	public String x(){
		return z();
	}
}
public class AccessDemo1 {//AccessDemo1은 A클래스에 관해 고객임
	public static void main(String[] args){
	A a=new A();
	System.out.println(a.y());
	//System.out.println(a.z());
	/*private는 접근 제어자! 클래스를 벗어나 고객과 접근할 수 없음. 실행시 오류발생
	맴버변수 접근제어자:public, protected, default, private
	Class 접근제어자:public, default(같은 패키지에서만 사용가능)
	
	참고) 하나의 소스코드 안에는 하나의 public클래스만 존재할 수 있다.*/
	System.out.println(a.x());
	}
}
