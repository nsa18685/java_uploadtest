package org.opentutorials.javatutorial.polymorphism;
class E{
	public String x(){return "E.x";}
}
class F extends E{
	public String x(){return"F.x";}
	public String y(){return "y";}
}
class F2 extends E{
	public String x(){return "F2.x";}
}
public class PolymorphismDemo3 {

	public static void main(String[] args) {
		//아래의 코드는 서로 다른 클래스 f와 f2가 동일한 데이터 타입 e로 인스턴스화 되었다.
		E obj = new F();
		E obj2 = new F2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
		//하지만 두 인스턴스의 메소드 x를 호출한 결과는 서로 다르다.
		//이것이 상속과 오버라이딩 그리고 형변환을 이용한 다형성이다.
	}

}
