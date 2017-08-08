package org.opentutorials.javatutorial.polymorphism;
//������ Ȱ���ϱ�
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
		System.out.println("+sum:"+_sum());//sum�� �������̵���
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
	public static void excute(Calculator cal){//data type�� Calculator��
		System.out.println("������");
		cal.run();
	}

	public static void main(String[] args) {
		Calculator c1=new CalculatorDecoPlus();//Calculator�� CalculatorDecoPlus�� �θ� Ŭ������
		c1.setOprands(10, 20);
		Calculator c2=new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		
		excute(c1);
		excute(c2);
		//����� data type�� Calculator��, �ߺ��� ������ �� ����.
	}

}