package org.opentutorials.javatutorials.object;

class Calculator {//Calculator라는 객체의 설계도(class)를 알려주겠다!, 객체는 단일 프로그램(변수와 메소드를 갖는)으로 보는 것이 좋다
	int left, right;
	
	public void setOprands(int left, int right){//setOprands매소드! main의(파라미터)의 값을 부여함
		this.left =left;
		this.right=right;
		/*
		  this.은 c1이라는 인스턴스를 가르치는 것임! 자신을 의미함!
		  && 초입에서 정의한 int left라는 변수를 가르키는 것임! 
		    우항의 그냥 left는 매개변수가 들어감! 
		    ex)여기서 보았을 때 this.left는 Calculator라는 class전역에서 접근할 수 있는 객체 속 변수인
		     int left 안에 파라미터(left)인 10을 담게 됨
		 */
	}
	
	public void sum(){
		System.out.println(this.left+this.right);//초입 int left와 int right를 이용하겠다는 것임!
	}
	
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
	
}

public class CalculatorDemo3{	
//logic의 의도! 어떻게 사용하는가?
	public static void main(String[] args) {
	
		Calculator c1 = new Calculator();
		/*
		 c1= 제품(인스턴스)
		 Calculator는 데이터 타입을 의미! 클래스를 선언한다는 것은 데이터타입을 내가 정하겠다는 의미!
		 클레스를 만드는 것은 메모리(공간)를 확보하겠다!변수를 선언한다는 것은 이 곳을 사용하겠다!
		 */
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20,40);
		c2.sum();
		c2.avg();
	}

}//참고:일반적으로 설계도인 클래스가 구체적 실체인 인스턴스가 되었을 때 객체라고 부른다.
//변수는 상태!를 바탕으로 해서 매소드 호출하는 것은 행위!=>객체는 상태와 행위의 집합!