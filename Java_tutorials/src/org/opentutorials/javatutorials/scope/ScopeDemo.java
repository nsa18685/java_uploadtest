package org.opentutorials.javatutorials.scope;

public class ScopeDemo {//��ȿ����=scope
	
	static void a(){
		int i=0; /*i��� ������ a�� �żҵ� �ܿ��� �̿���� ����, �Ʒ��� ���� i�ʹ� �ٸ��� �۵���
					��������*/
	}
	
	public static void main(String[] args) {
		for(int i=0; i<5; i++){//�� �� i ���� ���ʹ� �ٸ� ��������
			a();
			System.out.println(i);
		}

	}

}
