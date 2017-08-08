package org.opentutorials.javatutorial.polymorphism;
class A{
	public String x(){return "x";}
}
class B extends A{
	public String y(){return "y";}
}

public class PolymorphismDemo1 {
	public static void main(String[] args){
		A obj = new B();
		//class B를 인스턴스화 시킨 객체(obj)의 데이터 타입은 A!, class A행세를 하고 있음!
		obj.x();
		//obj.y(); //클래스 A에는 변수 y가 존재하지 않는다고 자바가 인식!
	}
}
