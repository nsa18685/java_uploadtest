package euni.start.test.from_lecture;
interface Product{
	static final String MAKER="K-Company";//interface의 변수의 제한자는 final또는 abstract이어야한다.
	static final String TEL="5423-4327";
	public long getPrice(int productID);//interface는 매소드의 header만 존재!
	public void printName();
}
class Electronics implements Product{//interface를 상속한 class는 반드시 interface의 매소드를 모두 오버라이딩(재정의)해야한다.
	public long getPrice(int productID){
		if(productID==1)
			return 1000;
		else return 2000;
	}
	public void printName(){
		System.out.println("electrical parts..");
	}
}
class Clothes implements Product{//여러 클래스가 interface를 상속할 수 있다.
	public long getPrice(int productID){
		if(productID==1)
			return 100;
		else return 10;
	}
	public void printName(){
		System.out.println("clothes..");
	}
}
public class Shop{
	static Electronics elec;//객체생성
	static Clothes cls;
	public static void init(){
		elec=new Electronics();//인스턴스 생성
		cls=new Clothes();
	}
	public static void orderList(Product item){//product는 interface로 인스턴스 생성X, 객체생성O
		item.printName();
		System.out.println("주문: "+item.MAKER+"전화번호: "+item.TEL);
		System.out.println("품목별 가격(만원): "+item.getPrice(2));
	}
	public static void main(String[] args) {
	init();
	orderList(elec);
	orderList(cls);

	}

}

	