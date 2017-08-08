package org.opentutorials.javatutorials.condition;

public class Condition4Demo {

	public static void main(String[] args) {
		if(true){
			System.out.println(1);
		} else if(false){
			System.out.println(2);
			
		} else if(false){
			System.out.print(3);
		
		}else{
			System.out.println(4);
		}

	}//first true만 실행됨!,위의 것들이 다 실행되지 않으면 else가 실행됨
	//else생략가능, else if는 복수가능

}
