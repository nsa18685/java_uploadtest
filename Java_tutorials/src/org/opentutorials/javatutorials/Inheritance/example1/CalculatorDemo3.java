package org.opentutorials.javatutorials.Inheritance.example1;

class DivisionableCalculator extends MultiplicationableCalculator {
    /* MultiplicationableCalculator��� Calculator�� �ڽ� Ŭ������
     	DivisionableCalculator��� �ڽ�Ŭ������ ���� �� ����
     	DivisionableCalculator�� �θ� Ŭ������ �żҵ�� �θ��� �θ� Ŭ������ �żҵ�(���)�� ��� ����
     	->�ڵ� �ߺ� ����, ��Ȱ�뼺, ����������, �������� ����*/
	public void division() {
        System.out.println(this.left / this.right);
    }
}
 
public class CalculatorDemo3 {
 
    public static void main(String[] args) {
 
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
 
}