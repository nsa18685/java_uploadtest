package org.opentutorials.javatutorials.accessmodirier.inner;
class A{
	public String y(){
		return"public void y()";
	}
	private String z(){
		return "public void z()";
	}
	
	public String x(){
		return z();
	}
}
public class AccessDemo1 {//AccessDemo1�� AŬ������ ���� ����
	public static void main(String[] args){
	A a=new A();
	System.out.println(a.y());
	//System.out.println(a.z());
	/*private�� ���� ������! Ŭ������ ��� ���� ������ �� ����. ����� �����߻�
	�ɹ����� ����������:public, protected, default, private
	Class ����������:public, default(���� ��Ű�������� ��밡��)
	
	����) �ϳ��� �ҽ��ڵ� �ȿ��� �ϳ��� publicŬ������ ������ �� �ִ�.*/
	System.out.println(a.x());
	}
}
