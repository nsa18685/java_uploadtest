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
		
		//�żҵ带 ��� ����� ���̴�
		obj.G();
		obj.H();
		
		//Ư���� �żҵ常 ����ϰ��� �Ѵ�.
		
		objI2.G();
		//objI2.H();
		
		//objI3.G();
		objI3.H();
		

	}

}
