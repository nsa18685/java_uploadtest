package org.opentutorials.javatutorials.constructor;

class CalculatorDemo{
	int left,right;
	
	public CalculatorDemo(int left, int right){//(인스턴스)생성자! 클래스와 같은 이름의 매소드-> 객체가 반드시 해야할 일이 있다면 절차를 생성자에 그 절차를 포함시키기!
		this.left=left;
		this.right=right;
	}
	
	public void sum(){
		System.out.println(this.left+this.right);
	}
	
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
	
}

public class Calculator {

	public static void main(String[] args) {
		CalculatorDemo c1=new CalculatorDemo(10,20);//new뒤에 있는 것은 클래스가 아니라 클래스의 생성자임!(매소드로 호출),new: 인스턴스를 만들때 사용
		//인스턴스 선언시 메소드이름이 같은 경우! left, right값을 미리 지정할 수 있음
		c1.sum();
		c1.avg();
		
		CalculatorDemo c2=new CalculatorDemo(20,40);
		c2.sum();
		c2.avg();
		
	}

}
