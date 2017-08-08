package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {
	//CalculatorDemo의 refactoring(재활용성을 높이기 위한 코드 재구성!)
	
	public static void sum(int left, int right){
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right){
		System.out.println((left+right)/2);
	}

	public static void main(String[] args) {
		int left,right;
		
		left=10;
		right=20;
		
		sum(left,right);
		avg(left,right);
		
		left=10;
		right=40;
		
		sum(left,right);
		avg(left,right);

	}//어떻게 grooping할 것이냐!=> 객체지향!

}
