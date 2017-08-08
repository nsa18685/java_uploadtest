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
	//SubstractionableCalculator라는 클래스는 Calculator클래스의 extend된 클래스, 즉 sub(자식)클래스를 의미함.
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);//SubstractionableCalculator클래스에 존재하지 않는 매소드는 그것의 부모클래스인 Calculator클래스에서 매소드를 찾는다!
        c1.sum();
        c1.avg();
        c1.substract();
    }
 
}