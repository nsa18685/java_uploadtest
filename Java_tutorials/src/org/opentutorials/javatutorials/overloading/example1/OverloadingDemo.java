package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo {
	void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    //�Ű������� �̸��� �ٸ� ���� �����߻�, �Ű������� ��, type�� ���� overloading�� Ȱ��Ǵ� ����!
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");} 
    //�żҵ� ���ϰ��� �ٸ� ��� �����߻�
    
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("���ϴ� �Ƕ�ĳ");
    }
}