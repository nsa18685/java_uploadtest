package org.opentutorials.javatutorials.Inheritance.example1;

class DivisionableCalculator extends MultiplicationableCalculator {
    /* MultiplicationableCalculator라는 Calculator의 자식 클래스는
     	DivisionableCalculator라는 자식클래스를 가질 수 있음
     	DivisionableCalculator는 부모 클래스의 매소드와 부모의 부모 클래스의 매소드(기능)을 모두 가짐
     	->코드 중복 제거, 재활용성, 유지보수편리, 가독성의 증가*/
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