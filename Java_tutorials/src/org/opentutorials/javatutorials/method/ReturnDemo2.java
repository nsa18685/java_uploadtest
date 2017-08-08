package org.opentutorials.javatutorials.method;

public class ReturnDemo2 {
	public static String num(int i) {
        if(i==0){
            return "zero";//false이기 때문에 return을 읽지 않음
        } else if(i==1){
            return "one";
        } else if(i==2){
            return "two";
        }
        return "none";
    }
 
    public static void main(String[] args) {
        System.out.println(num(1));
    }
}
