package org.opentutorials.javatutorials.accessmodirier.inner;

class Calculator{
	private int left,right;//사용자가 의도치 않게 클래스,매소드의 상태를 바꿀 수 없도록하기 위해!
	
	public void setOprands(int left, int right){
		this.left=left;
		this.right=right;
	}
	private int _sum(){
		return this.left+this.right;
	}
	public void sumDecoPlus(){
		System.out.println("+++"+_sum()+"+++");
	}
	public void sumDecoMinus(){
		System.out.println("---"+_sum()+"---");
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
	 Calculator c1=new Calculator();
	 c1.setOprands(10,20);
	 c1.sumDecoPlus();
	 c1.sumDecoMinus();
	}
	
}
