package org.opentutorials.javatutorials.constructor;

class CalculatorDemo{
	int left,right;
	
	public CalculatorDemo(int left, int right){//(�ν��Ͻ�)������! Ŭ������ ���� �̸��� �żҵ�-> ��ü�� �ݵ�� �ؾ��� ���� �ִٸ� ������ �����ڿ� �� ������ ���Խ�Ű��!
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
		CalculatorDemo c1=new CalculatorDemo(10,20);//new�ڿ� �ִ� ���� Ŭ������ �ƴ϶� Ŭ������ ��������!(�żҵ�� ȣ��),new: �ν��Ͻ��� ���鶧 ���
		//�ν��Ͻ� ����� �޼ҵ��̸��� ���� ���! left, right���� �̸� ������ �� ����
		c1.sum();
		c1.avg();
		
		CalculatorDemo c2=new CalculatorDemo(20,40);
		c2.sum();
		c2.avg();
		
	}

}
