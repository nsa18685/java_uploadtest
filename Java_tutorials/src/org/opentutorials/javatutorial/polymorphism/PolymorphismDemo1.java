package org.opentutorials.javatutorial.polymorphism;
class A{
	public String x(){return "x";}
}
class B extends A{
	public String y(){return "y";}
}

public class PolymorphismDemo1 {
	public static void main(String[] args){
		A obj = new B();
		//class B�� �ν��Ͻ�ȭ ��Ų ��ü(obj)�� ������ Ÿ���� A!, class A�༼�� �ϰ� ����!
		obj.x();
		//obj.y(); //Ŭ���� A���� ���� y�� �������� �ʴ´ٰ� �ڹٰ� �ν�!
	}
}
