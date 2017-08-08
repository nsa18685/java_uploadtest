package org.opentutorials.javatutorial.polymorphism;
class C{
	public String x(){return "C.x";}
}
class D extends C{
	public String x(){return"D.x";}//오버라이딩
	public String y(){return "y";}
}
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		C obj = new D();
		System.out.println(obj.x());
			//obj는 C행세를 하지만 class D의 맴버의 동작방식을 이용한다."오버라이딩"
		//System.out.println(obj.y()); //A에 존재하는 맴버만이 클래스B의 맴버가 된다.
	}

}
