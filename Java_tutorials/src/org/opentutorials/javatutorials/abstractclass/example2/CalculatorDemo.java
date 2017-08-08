package org.opentutorials.javatutorials.abstractclass.example2;
abstract class Calculator{
	int left, right;
	public void setOprands(int left, int right){
		this.left=left;
		this.right=right;
	}
	int _sum(){
		return this.left+this.right;
	}//공통된 부분, 중복된 부분을 제거하기위해 make
	//default 접근제어자를 이용: 같은 패키지 안에서만 사용할 수 있도록 제한.
	public abstract void sum();
	public abstract void avg();
	public void run(){
		sum();
		avg();
	}//자식 클래스에서 위와 같은 순서로 호출하여 사용함(공통적)
	//vs 구체적 동작방법은 하위클래스에서 구현하도록 강제(다른 점)
}
class CalculatorDecoPlus extends Calculator{
	public void sum(){
		System.out.println("+sum:"+_sum());
	}
	public void avg(){
		System.out.println("+avg"+(this.left+this.right)/2);
	}
}

class CalculatorDecoMinus extends Calculator{
	public void sum(){
		System.out.println("-sum:"+_sum());
	}
	public void avg(){
		System.out.println("-avg"+(this.left+this.right)/2);
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		//합계를 구하고 평균을 공통적인것은 클래스가 구현
		//다른 것들은 구하는 방식을 사용자에게 구현을 위임
		CalculatorDecoPlus c1=new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
		CalculatorDecoMinus c2=new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}

}
