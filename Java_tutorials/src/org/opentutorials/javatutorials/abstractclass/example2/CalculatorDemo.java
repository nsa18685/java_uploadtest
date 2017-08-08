package org.opentutorials.javatutorials.abstractclass.example2;
abstract class Calculator{
	int left, right;
	public void setOprands(int left, int right){
		this.left=left;
		this.right=right;
	}
	int _sum(){
		return this.left+this.right;
	}//����� �κ�, �ߺ��� �κ��� �����ϱ����� make
	//default ���������ڸ� �̿�: ���� ��Ű�� �ȿ����� ����� �� �ֵ��� ����.
	public abstract void sum();
	public abstract void avg();
	public void run(){
		sum();
		avg();
	}//�ڽ� Ŭ�������� ���� ���� ������ ȣ���Ͽ� �����(������)
	//vs ��ü�� ���۹���� ����Ŭ�������� �����ϵ��� ����(�ٸ� ��)
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
		//�հ踦 ���ϰ� ����� �������ΰ��� Ŭ������ ����
		//�ٸ� �͵��� ���ϴ� ����� ����ڿ��� ������ ����
		CalculatorDecoPlus c1=new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
		CalculatorDecoMinus c2=new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}

}
