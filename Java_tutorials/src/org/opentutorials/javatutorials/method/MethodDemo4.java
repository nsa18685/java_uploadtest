package org.opentutorials.javatutorials.method;

public class MethodDemo4 {

	
	public static  String numbering(int init, int limit){//return을 통해 반환할 값의 데이터형식은 메소드의 이름 옆에 명시해야한다. 여기서 메소드 이름은 numbering이고 데이터형식은 String이다.
		//만약 반환할 값이 없다면 void를 적는다!

		int i = init;
		
		// 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
		String output="";
		while (i<=limit){
        output +=i;//== (output== output+i;)
        i++;
		}
		
		return output;
		//중요!!return에서 자바는 무조건 실행을 종료시킨다! 메소드의 출력값으로 외부로(결과로) 반환한다!(불러온 곳으로 값을 넘김!)
	}
	
	//여길 먼저 보자!
public static void main(String[] args){//void: 메소드의 return값을 사용하지 않는다!
	String result= numbering (3, 5);
	System.out.println(result);
	
}
}
