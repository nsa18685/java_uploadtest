package org.opentutorials.javatutorials.Inheritance.example2;

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
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
      //추가됨 ->초기화하는 과정
       /*부모클래스가 초기화되기 전에 자식이 초기화되는 일을 방지하기위해
       // super(left, right);
       * 로 바꿀 수 있음
       	하위클래스에서 추가로 초기화시 super보다 아래에 생성자를 위치시켜야한다 */
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
