package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo {
	void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    //매개변수의 이름만 다른 것은 오류발생, 매개변수의 수, type에 따라 overloading이 활용되는 것임!
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");} 
    //매소드 리턴값이 다른 경우 오류발생
    
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("으니는 또또캐");
    }
}