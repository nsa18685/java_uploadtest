package org.opentutorials.javatutorials.object;

class Calculator2 {
	static double PI=3.14;
	static int base = 0;
	//static변수는 클래스에 소속됨. 모든 인스턴스에서 같은 값을 갖게됨(final을 쓰는 것이 더 바람직,but배우지 않음
	int left, right;
	//인스턴스의 맴버=> 인스턴스에 따라 다르게 값을 가짐
	
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
		// class와 instance의 변수는 다를 수 있다.

		Calculator2 c1= new Calculator2();
		System.out.println(c1.PI);
		//인스턴스에서 PI접근
		Calculator2 c2= new Calculator2();
		System.out.println(c2.PI);
		
		System.out.println(Calculator2.PI);
		//클래스에서 PI접근, 굳이 인스턴스를 이용할 필요가 없는경우
		
		Calculator2.base = 10;
		
		 c1.setOprands(10, 20);
		 c1.sum();
		 
		 c2.setOprands(20, 40);
		 c2.sum();
		 
	}

}
