package org.opentutorials.javatutorials.abstractclass.example1;
abstract class A{//�߻�Ŭ������ �ݵ�� ����Ͽ� �̿��ؾ��Ѵ�.
	public abstract int b();
	//�߻� �żҵ�� �żҵ��� ��ü���� ������ ������ �ʰ� �ñ״�ó�� ���� ����(����)
	//�������̵��Ͽ� ����ϴ� �ʿ��� �����ؼ� ����ؾ���
	//�߻� �żҵ带 �����ִ� Ŭ������ abstract�� �ȴ�
	//����: public abstract int c(){System.out.println("hellow")}
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
		//����: A obj=new A();
		B obj=new B();
	}

}
