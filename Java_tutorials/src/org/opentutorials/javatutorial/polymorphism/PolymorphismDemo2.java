package org.opentutorials.javatutorial.polymorphism;
class C{
	public String x(){return "C.x";}
}
class D extends C{
	public String x(){return"D.x";}//�������̵�
	public String y(){return "y";}
}
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		C obj = new D();
		System.out.println(obj.x());
			//obj�� C�༼�� ������ class D�� �ɹ��� ���۹���� �̿��Ѵ�."�������̵�"
		//System.out.println(obj.y()); //A�� �����ϴ� �ɹ����� Ŭ����B�� �ɹ��� �ȴ�.
	}

}
