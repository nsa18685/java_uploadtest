package org.opentutorials.javatutorials.object;

class Calculator3{
	  
    public static void sum(int left, int right){
        System.out.println(left+right);
    }//static�� �پ������� Ŭ���� �Ҽ��� �żҵ尡 ��, �ν��Ͻ� �ʿ����
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
    
}
 
public class CalculatorDemo5 {
     
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
    /*
   	�ν��Ͻ� ����,Ŭ������ ���� �����Ͽ� ���ڸ� ������ �� ����
   	���� ���ڸ� ������ ����� �ʿ䰡 ���� ��,
   	
   	���� �޼ҵ尡 �ν��Ͻ� ������ �������� �ʴ´ٸ� 
   	Ŭ���� �޼ҵ带 ����ؼ� ���ʿ��� �ν��Ͻ��� ������ ���� �� �ִ�.
     */
 
}