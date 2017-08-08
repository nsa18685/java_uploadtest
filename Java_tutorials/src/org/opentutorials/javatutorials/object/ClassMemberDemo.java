package org.opentutorials.javatutorials.object;

class C1{
    static int static_variable = 1;
    int instance_variable = 2;
    static void static_static(){
        System.out.println(static_variable);
    }//변수의 이름에 클래스 또는 인스턴스의 변수임을 나타낼 수 있다. 이로 구분하기 용이함
    
    static void static_instance(){
        /* 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다. 
    	클래스를 먼저 만들고 인스턴스를 만듬,아직 생성되지 않은 인스턴스에는 접근할 수 없음*/
        
    	//System.out.println(instance_variable); //컴파일 에러를 발생시킴, 주석 해제해서 실행할 것임
    }
    void instance_static(){
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
        System.out.println(static_variable);
    }
    void instance_instance(){        
        System.out.println(instance_variable);
    }
}
public class ClassMemberDemo {  
    public static void main(String[] args) {
        C1 c = new C1();
        //c는 인스턴스 C1은 클래스
        
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
        c.static_static();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 인스턴스 변수에 접근 -> 실패
        c.static_instance();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        c.instance_static();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공 
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        c.instance_instance();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공
        //C1.static_static();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        //C1.static_instance();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_static();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_instance();
    }
 
}/*인스턴스 변수와 클래스 변수는 아래와 같이 부르기도 한다.

인스턴스 변수 -> Non-Static Field
클래스 변수 -> Static Field*/
