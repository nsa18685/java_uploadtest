package org.opentutorials.javatutorial.polymorphism;
interface I2{
	public String G();
}
interface I3{
	public String H();
}
class J implements I2,I3{
	public String G(){
		return "G";
	}
	public String H(){
		return "H";
	}
}
public class PolymorphismDemo4 {

	public static void main(String[] args) {
		J obj =new J();
		I2 objI2=new J();
		I3 objI3= new J();
		
		//매소드를 모두 사용할 것이다
		obj.G();
		obj.H();
		
		//특별한 매소드만 사용하고자 한다.
		
		objI2.G();
		//objI2.H();
		
		//objI3.G();
		objI3.H();
		

	}

}
