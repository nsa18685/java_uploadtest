package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		//  String[] classGroup ={"��","����","������"};
		  String[] classGroup =new String[3];//�� ���� ���� ������ �� �ִ���! ���� �ʼ�!
		  //�޸�(RAM)�� �󸶳� �Ҵ����� ���̳�!ȿ������ ���鿡��
    classGroup[0]="��";
	System.out.println(classGroup.length);//length: �迭�� ���� �� �ִ� ������ ������ �˾ƿ�!=���⼱ 3
	classGroup[1]="����";
	System.out.println(classGroup.length);
	classGroup[2]="������";
	System.out.println(classGroup.length);
	//��Ȱ����!

	
	}

}
