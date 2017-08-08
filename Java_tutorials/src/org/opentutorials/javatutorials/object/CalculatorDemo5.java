package org.opentutorials.javatutorials.object;

class Calculator3{
	  
    public static void sum(int left, int right){
        System.out.println(left+right);
    }//static이 붙어있으면 클래스 소속의 매소드가 됨, 인스턴스 필요없음
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
    
}
 
public class CalculatorDemo5 {
     
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
    /*
   	인스턴스 없음,클래스에 직접 접근하여 인자를 전달할 수 있음
   	굳이 인자를 여러번 사용할 필요가 없을 때,
   	
   	만약 메소드가 인스턴스 변수를 참조하지 않는다면 
   	클래스 메소드를 사용해서 불필요한 인스턴스의 생성을 막을 수 있다.
     */
 
}