package org.opentutorials.javatutorials.object;

class Calculator {//Calculator��� ��ü�� ���赵(class)�� �˷��ְڴ�!, ��ü�� ���� ���α׷�(������ �޼ҵ带 ����)���� ���� ���� ����
	int left, right;
	
	public void setOprands(int left, int right){//setOprands�żҵ�! main��(�Ķ����)�� ���� �ο���
		this.left =left;
		this.right=right;
		/*
		  this.�� c1�̶�� �ν��Ͻ��� ����ġ�� ����! �ڽ��� �ǹ���!
		  && ���Կ��� ������ int left��� ������ ����Ű�� ����! 
		    ������ �׳� left�� �Ű������� ��! 
		    ex)���⼭ ������ �� this.left�� Calculator��� class�������� ������ �� �ִ� ��ü �� ������
		     int left �ȿ� �Ķ����(left)�� 10�� ��� ��
		 */
	}
	
	public void sum(){
		System.out.println(this.left+this.right);//���� int left�� int right�� �̿��ϰڴٴ� ����!
	}
	
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
	
}

public class CalculatorDemo3{	
//logic�� �ǵ�! ��� ����ϴ°�?
	public static void main(String[] args) {
	
		Calculator c1 = new Calculator();
		/*
		 c1= ��ǰ(�ν��Ͻ�)
		 Calculator�� ������ Ÿ���� �ǹ�! Ŭ������ �����Ѵٴ� ���� ������Ÿ���� ���� ���ϰڴٴ� �ǹ�!
		 Ŭ������ ����� ���� �޸�(����)�� Ȯ���ϰڴ�!������ �����Ѵٴ� ���� �� ���� ����ϰڴ�!
		 */
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20,40);
		c2.sum();
		c2.avg();
	}

}//����:�Ϲ������� ���赵�� Ŭ������ ��ü�� ��ü�� �ν��Ͻ��� �Ǿ��� �� ��ü��� �θ���.
//������ ����!�� �������� �ؼ� �żҵ� ȣ���ϴ� ���� ����!=>��ü�� ���¿� ������ ����!