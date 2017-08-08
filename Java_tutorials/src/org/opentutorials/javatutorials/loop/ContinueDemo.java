package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i =0; i<10; i++){
			if(i==5)//{if(true)의 경우만 실행 됨
				continue;//만약 5라면 현재 반복만 종료=5 출력X, 그 다음 반복은 다시 실행됨.
			//}
			System.out.println("Cording Everybody"+i);
		}


	}

}
