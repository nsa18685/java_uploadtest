package org.opentutorials.javatutorials.exception;
//�⺻������ ǥ�� ����Ŭ������ ����սô�! ���� ��� ���弼��~
//ArithmeticException�� �������� Exception���� �̿��غ���.
/*class DivideException extends ArithmeticException{
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
}*/
//checked Exception
class DivideException extends Exception{
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
}
//unchecked Exception���� try_catch�������� ���´�.
class Calculator{
	int left,right;
	public void setOprands(int left,int right){
		this.left=left;
		this.right=right;
	}
	public void divide() throws DivideException{
		if(right==0){
			throw new DivideException("0���� ���� �� �����ϴ�.");
		}
		System.out.print(this.left/this.right);
	}
}

public class CalculatoDemo {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.setOprands(10, 0);
		try{
			c1.divide();
		}catch(DivideException e){
			e.getMessage();
		}
	}

}
