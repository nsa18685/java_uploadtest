package org.opentutorials.javatutorials.abstractclass.example1;
abstract class A{//추상클래스는 반드시 상속하여 이용해야한다.
	public abstract int b();
	//추상 매소드는 매소드의 구체적인 로직을 가지지 않고 시그니처만 갖고 있음(형식)
	//오버라이딩하여 사용하는 쪽에서 정의해서 사용해야함
	//추상 매소드를 갖고있는 클래스도 abstract가 된다
	//오류: public abstract int c(){System.out.println("hellow")}
	public void d(){
		System.out.println("world");
	}
}
class B extends A{
	public int b(){
		return 1;
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		//오류: A obj=new A();
		B obj=new B();
	}

}
