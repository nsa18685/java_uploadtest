package org.opentutorials.javatutorials.io;
import java.util.Scanner;
//������ �������� ���ܵ���
public class ScannerDemo {
 
    public static void main(String[] args) { //String[] args�� ���ɻ簡 �ƴϴ�
        Scanner sc = new Scanner(System.in); 
        //java.util �� Scanner�� ����ϰڴ�! 'System.in:����ڰ� �Է��� ��'�� Scan�ϰڴ�!, sc�� ����!
        int i = sc.nextInt(); //������ ���߰� ��ٸ� ����! �Է°��� �����ϰ� �ִٰ� enterġ�� ������ �ٽ� ���۵Ǿ� i�� ����!
        System.out.println(i*1000);
        sc.close();
    }
 
}