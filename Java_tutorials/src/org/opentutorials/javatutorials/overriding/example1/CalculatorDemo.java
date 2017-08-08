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
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
    }//overriding(������)->�̸� console��(�θ�Ŭ�������� ���� �켱������ ����)
     
    /*1) public int avg(){
    	return(this.left+this.right)/2;
    }*/
    //�����߻�! �θ�Ŭ������ ȣȯ���� �ʴ´�. �θ�(void)���İ� �ڽ�(int)������ ����ġ! <�żҵ� ����(signature)�� ��ġ�ؾ���>
    //2)�� ���� �θ�Ŭ������ �����ϴ� ���� ��ġ �ʴ´� �ֳ��ϸ� �ߺ��� �߻��ϱ� ����, �̶��� 3������ �ڽ�Ŭ������ �ٲ� �ߺ��� ���ؾ���

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