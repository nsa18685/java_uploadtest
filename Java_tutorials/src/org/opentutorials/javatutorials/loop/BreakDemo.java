package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		for(int i =0; i<10; i++){
			if(i==5)//{if(true)의 경우 실행 됨
				break;//만약 5라면 멈춰라!= 5이상 출력X
			//} 구문이 한 줄인 경우 {}생략 가능!
			System.out.println("Cording Everybody"+i);
		}

	}

}
