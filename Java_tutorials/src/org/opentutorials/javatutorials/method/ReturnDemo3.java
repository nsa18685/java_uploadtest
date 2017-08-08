package org.opentutorials.javatutorials.method;

public class ReturnDemo3 {
	//return을 여러개 하고 싶다!->배열이용
	
	public static String getMember1() {
        return "최진혁";
    }
 
    public static String getMember2() {
        return "최유빈";
    }
 
    public static String getMember3() {
        return "한이람";
    }
 
    public static void main(String[] args) {
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
    }
}
