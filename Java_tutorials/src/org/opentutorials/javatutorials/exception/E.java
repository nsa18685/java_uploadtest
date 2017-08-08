package org.opentutorials.javatutorials.exception;
/*����: ������ �����ϴ� �� (�������� �ʴ� ��)
������ �ٽ��� �޼����̴�
ThrowableŬ������ ����� ���� ���� ��� throw�� �Ұ��� �ϴ�.*/

import java.io.IOException;

class E {
	void throwArithmeticException(){
		throw new ArithmeticException();
	}/*���� Ŭ������ throw �ڿ� �ν��Ͻ�ȭ ���Ѽ� ��������
	ArithmeticException�� RuntimeException��ü�� ��ӵǾ�����
	unchecked Exception��:try-catch���� �ʿ� ����*/
	
	void throwIOException1(){
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//checked Exception��! RuntimeException�� ������ Exception�� ����Ŭ������ ����ó���� �����ؾ���
		//throw new Exception=>try{}catch{����}����!
		/*���� catch��� ����
		catch�� ������ �Ʒ��� ó���Ǳ⶧���� �Ʒ��� Ŭ������ �� �������̾���Ѵ�.
		else if�� ���� ����
		���� �߻��� �żҵ尡 ������ ���� �ƴ϶� catch�� �������� �����
		��)
		��ü.getMessage():�⺻�� ����
		��ü.toString():���� �ڼ��� ����
		��ü.printStackTrace():���������� ȭ�鿡 ���������� ��� 
		finally{
		���ܿ��ο� ������� ����Ǵ� ����(�ݵ�� ����Ǿ���ϴ� ��)
		}
		*/
	}
	void throwIOException2() throws IOException{
		throw new IOException();
	}
}