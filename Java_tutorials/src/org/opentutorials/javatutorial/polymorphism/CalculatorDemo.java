package org.opentutorials.javatutorial.polymorphism;
//다형성 활용하기
abstract class Calculator{
	int left, right;
	public void setOprands(int left, int right){
		this.left=left;
		this.right=right;
	}
	int _sum(){
		return this.left+this.right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run(){
		sum();
		avg();
	}
}
class CalculatorDecoPlus extends Calculator{
	public void sum(){
		System.out.println("+sum:"+_sum());//sum을 오버라이딩함
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
	public static void excute(Calculator cal){//data type은 Calculator임
		System.out.println("실행결과");
		cal.run();
	}

	public static void main(String[] args) {
		Calculator c1=new CalculatorDecoPlus();//Calculator는 CalculatorDecoPlus의 부모 클래스임
		c1.setOprands(10, 20);
		Calculator c2=new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		
		excute(c1);
		excute(c2);
		//공통된 data type이 Calculator임, 중복을 제거할 수 있음.
	}

}