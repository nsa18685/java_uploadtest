package org.opentutorials.javatutorials.Inheritance.example1;

class MultiplicationableCalculator extends Calculator {
	/*CalculatorŬ������ CalculatorDemo1�� ������
	 CalculatorŬ������ �ռ� ������ SubstractionableCalculator�ܿ��� MultiplicationableCalculator��� �ڽ� Ŭ������ ���� �� ����*/
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}
 
public class CalculatorDemo2 {
 
    public static void main(String[] args) {
 
        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
    }
 
}