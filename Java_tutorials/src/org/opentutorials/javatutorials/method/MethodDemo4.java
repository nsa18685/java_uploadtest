package org.opentutorials.javatutorials.method;

public class MethodDemo4 {

	
	public static  String numbering(int init, int limit){//return�� ���� ��ȯ�� ���� ������������ �޼ҵ��� �̸� ���� ����ؾ��Ѵ�. ���⼭ �޼ҵ� �̸��� numbering�̰� ������������ String�̴�.
		//���� ��ȯ�� ���� ���ٸ� void�� ���´�!

		int i = init;
		
		// ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
		String output="";
		while (i<=limit){
        output +=i;//== (output== output+i;)
        i++;
		}
		
		return output;
		//�߿�!!return���� �ڹٴ� ������ ������ �����Ų��! �޼ҵ��� ��°����� �ܺη�(�����) ��ȯ�Ѵ�!(�ҷ��� ������ ���� �ѱ�!)
	}
	
	//���� ���� ����!
public static void main(String[] args){//void: �޼ҵ��� return���� ������� �ʴ´�!
	String result= numbering (3, 5);
	System.out.println(result);
	
}
}
