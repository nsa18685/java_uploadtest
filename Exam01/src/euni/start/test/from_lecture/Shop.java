package euni.start.test.from_lecture;
interface Product{
	static final String MAKER="K-Company";//interface�� ������ �����ڴ� final�Ǵ� abstract�̾���Ѵ�.
	static final String TEL="5423-4327";
	public long getPrice(int productID);//interface�� �żҵ��� header�� ����!
	public void printName();
}
class Electronics implements Product{//interface�� ����� class�� �ݵ�� interface�� �żҵ带 ��� �������̵�(������)�ؾ��Ѵ�.
	public long getPrice(int productID){
		if(productID==1)
			return 1000;
		else return 2000;
	}
	public void printName(){
		System.out.println("electrical parts..");
	}
}
class Clothes implements Product{//���� Ŭ������ interface�� ����� �� �ִ�.
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
	static Electronics elec;//��ü����
	static Clothes cls;
	public static void init(){
		elec=new Electronics();//�ν��Ͻ� ����
		cls=new Clothes();
	}
	public static void orderList(Product item){//product�� interface�� �ν��Ͻ� ����X, ��ü����O
		item.printName();
		System.out.println("�ֹ�: "+item.MAKER+"��ȭ��ȣ: "+item.TEL);
		System.out.println("ǰ�� ����(����): "+item.getPrice(2));
	}
	public static void main(String[] args) {
	init();
	orderList(elec);
	orderList(cls);

	}

}

	