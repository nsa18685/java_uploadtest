package org.opentutorials.javatutorial.polymorphism;
class E{
	public String x(){return "E.x";}
}
class F extends E{
	public String x(){return"F.x";}
	public String y(){return "y";}
}
class F2 extends E{
	public String x(){return "F2.x";}
}
public class PolymorphismDemo3 {

	public static void main(String[] args) {
		//�Ʒ��� �ڵ�� ���� �ٸ� Ŭ���� f�� f2�� ������ ������ Ÿ�� e�� �ν��Ͻ�ȭ �Ǿ���.
		E obj = new F();
		E obj2 = new F2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
		//������ �� �ν��Ͻ��� �޼ҵ� x�� ȣ���� ����� ���� �ٸ���.
		//�̰��� ��Ӱ� �������̵� �׸��� ����ȯ�� �̿��� �������̴�.
	}

}
