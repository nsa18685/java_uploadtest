package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = {"뀨","으니","가온이"};
		for(String e : members){
			//:뒤에 따라오는 데이터의 값들을 하나씩 꺼내서 e에 담도록 약속되어있음.
			System.out.println(e + " 사랑합니다");
		}
	}

}
