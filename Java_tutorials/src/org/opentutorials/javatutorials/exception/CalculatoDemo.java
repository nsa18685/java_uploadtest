package org.opentutorials.javatutorials.exception;
//기본적으론 표준 예외클래스를 사용합시다! 없는 경우 만드세요~
//ArithmeticException을 직접만든 Exception으로 이용해보자.
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
//unchecked Exception으로 try_catch구문으로 묶는다.
class Calculator{
	int left,right;
	public void setOprands(int left,int right){
		this.left=left;
		this.right=right;
	}
	public void divide() throws DivideException{
		if(right==0){
			throw new DivideException("0으로 나눌 수 없습니다.");
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
