package org.opentutorials.javatutorials.Inheritance.example3;

class Calculator {
    int left, right;
     
    public Calculator(){}
    
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }//매개변수를 만든경우->인스턴스 생성시 기본 생성자가 존재하지 않는다. 위와 같이 생성해주어야한다.
     
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
        super(left,right);
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}