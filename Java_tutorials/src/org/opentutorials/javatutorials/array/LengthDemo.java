package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		//  String[] classGroup ={"뀨","으니","가온이"};
		  String[] classGroup =new String[3];//몇 개의 값을 수용할 수 있느냐! 정의 필수!
		  //메모리(RAM)을 얼마나 할당해줄 것이냐!효율적인 측면에서
    classGroup[0]="뀨";
	System.out.println(classGroup.length);//length: 배열이 담을 수 있는 원소의 개수를 알아옴!=여기선 3
	classGroup[1]="으니";
	System.out.println(classGroup.length);
	classGroup[2]="가온이";
	System.out.println(classGroup.length);
	//분활정의!

	
	}

}
