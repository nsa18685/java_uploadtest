package org.opentutorials.javatutorials.Inheritance.example1;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
	//SubstractionableCalculator��� Ŭ������ CalculatorŬ������ extend�� Ŭ����, �� sub(�ڽ�)Ŭ������ �ǹ���.
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);//SubstractionableCalculatorŬ������ �������� �ʴ� �żҵ�� �װ��� �θ�Ŭ������ CalculatorŬ�������� �żҵ带 ã�´�!
        c1.sum();
        c1.avg();
        c1.substract();
    }
 
}