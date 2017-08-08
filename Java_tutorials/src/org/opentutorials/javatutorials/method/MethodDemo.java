package org.opentutorials.javatutorials.method;

public class MethodDemo {

	public static void numbering(int limit){//입력값!parameter
		int i = 0;
		while (i<limit){
			System.out.println(i);
			i++;
		}
	}
	
public static void main(String[] args){
	numbering (5);//인자, argument
}
//==고정적인 것과 가변적인 것을 함께 하면 가변적인 것을 변경하기 어려움

}
