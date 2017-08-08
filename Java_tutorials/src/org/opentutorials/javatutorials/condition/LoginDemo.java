package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0]; //args[0]= 입력값(을 알아 낼 수 있는..문법!몰라도됨(arguments인듯))
		if(id.equals("eunijoa")){ //.equals:비교연산자
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}
	//실습용임, 입력값을 전달하기 위해선	run configuration에서 argument에서 입력 		

	}

}
