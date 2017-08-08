package org.opentutorials.javatutorials.overriding.example1;

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
    /*2) public int avg(){
     return((this.left + this.right) / 2);
     }
    */
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }//overriding(재정의)->이를 console함(부모클래스보다 높은 우선순위를 가짐)
     
    /*1) public int avg(){
    	return(this.left+this.right)/2;
    }*/
    //오류발생! 부모클래스가 호환되지 않는다. 부모(void)형식과 자식(int)형식은 불일치! <매소드 서명(signature)이 일치해야함>
    //2)와 같이 부모클래스를 변경하는 것을 원치 않는다 왜냐하면 중복이 발생하기 때문, 이때는 3과같이 자식클래스를 바꿔 중복을 피해야함

    /*3) public int avg(){
    	return super.avg();
    }*/
    
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}