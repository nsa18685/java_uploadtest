package org.opentutorials.javatutorials.object;

class Calculator2 {
	static double PI=3.14;
	static int base = 0;
	//static������ Ŭ������ �Ҽӵ�. ��� �ν��Ͻ����� ���� ���� ���Ե�(final�� ���� ���� �� �ٶ���,but����� ����
	int left, right;
	//�ν��Ͻ��� �ɹ�=> �ν��Ͻ��� ���� �ٸ��� ���� ����
	
	public void setOprands(int left, int right){
		this.left=left;
		this.right=right;
	}
	
	public void sum(){
		System.out.println(this.left+this.right+ base);
	}
	
	public void avg(){
		System.out.println((this.left+this.right+ base)/2);
	}
}
public class CalculatoDemo4 {
	public static void main(String[] args) {
		// class�� instance�� ������ �ٸ� �� �ִ�.

		Calculator2 c1= new Calculator2();
		System.out.println(c1.PI);
		//�ν��Ͻ����� PI����
		Calculator2 c2= new Calculator2();
		System.out.println(c2.PI);
		
		System.out.println(Calculator2.PI);
		//Ŭ�������� PI����, ���� �ν��Ͻ��� �̿��� �ʿ䰡 ���°��
		
		Calculator2.base = 10;
		
		 c1.setOprands(10, 20);
		 c1.sum();
		 
		 c2.setOprands(20, 40);
		 c2.sum();
		 
	}

}
