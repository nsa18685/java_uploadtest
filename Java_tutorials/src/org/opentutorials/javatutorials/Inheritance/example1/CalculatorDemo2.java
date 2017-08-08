package org.opentutorials.javatutorials.Inheritance.example1;

class MultiplicationableCalculator extends Calculator {
	/*Calculator클래스는 CalculatorDemo1에 존재함
	 Calculator클래스는 앞서 정의한 SubstractionableCalculator외에도 MultiplicationableCalculator라는 자식 클래스를 가질 수 있음*/
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