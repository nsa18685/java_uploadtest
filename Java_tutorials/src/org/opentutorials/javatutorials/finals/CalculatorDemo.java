package org.opentutorials.javatutorials.finals;
class Calculator {
    static final double PI = 3.14; //PI�� ������ �ʴ� ����->final���
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6; //final���� �����ϰ����ҽ� error�߻�
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;

	}

}
