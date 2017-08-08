package org.opentutorials.javatutorials.finals;
class Calculator {
    static final double PI = 3.14; //PI는 변하지 않는 값임->final사용
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6; //final값을 변경하고자할시 error발생
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
