package euni.start.test.from_lecture;
import java.util.*;

class Employee{
	protected String name;
	protected String sno;
	
	public Employee(String name, String sno){
		this.name=name;
		this.sno=sno;
	}
	public String work(){
		return String.format("�̸�:%s �����ȣ:%s",name,sno);
	}
	public long earnings(){
		System.out.println("�ҵ��");
		return 0;
	}
}

class Staff extends Employee{
	String title;
	long staffpay;
	
	public Staff(String name, String sno, String title, long staffpay){
		super(name,sno);
		this.title=title;
		this.staffpay=staffpay;
	}
	public long earning(){
		return 20+staffpay;
	}
	public String work(){
		String result="";
		result +=super.work()+",��å: "+title+", ";
		return result;
	}
}	
class TempEmployee extends Employee{
	String hdept;
	long temphour;
	
	public TempEmployee(String name, String sno, String hdept, long temphour){
		super(name,sno);
		this.hdept=hdept;
		this.temphour=temphour;
	}
	public long earning(){
		return temphour*3;
	}
	public String work(){
		String result=" ";
		result +=super.work()+", �μ�: "+hdept+", �ٹ��ð���: "+temphour+", ";
		return result;
	}
}
class RegEmployee extends Employee{
	String dept;
	long regpay;
	String regtitle;
	
	public RegEmployee(String name, String sno, String dept, long regpay,String regtitle){
		super(name, sno);
		this.dept=dept;
		this.regpay=regpay;
		this.regtitle=regtitle;
	}
	public long earning(){
		return 10+regpay;
	}
	public String work(){
		String result=" ";
		result += super.work()+", �μ�: "+dept+", ������: "+regpay+", ";
		return result;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		final int n=Integer.parseInt(args[0]);
		Scanner scn=new Scanner(System.in);
		Employee[] emp=new Employee[n];
		Staff sf;
		RegEmployee rg;
		TempEmployee tp;
		String sno, name;
		System.out.println("�Է� �ڷ��"+ n);
		for(int i=0;i<n;i++){
			System.out.println("\n�����ȣ, �̸�..");
			sno=scn.next();
			name=scn.next();
			System.out.println("����� �ٹ�����:(1:CEO, 2:������, 3:�ӽ���);..");
			int kind=scn.nextInt();
			switch(kind){
			case 1: System.out.printf("��å, ���ӱ�..");
					String title=scn.next();
					long staffpay=scn.nextLong();
					sf= new Staff(name,sno,title,staffpay);
					emp[i]=sf;
					break;
			case 2: System.out.printf("�μ�, ����, ���ӱ� ..");
					String dept=scn.next();
					String regtitle=scn.next();
					long regpay=scn.nextLong();
					rg= new RegEmployee(name,sno,dept,regpay,regtitle);
					emp[i]=rg;
					break;
			case 3: System.out.printf("�μ�, ���ٹ��ð���..");
					String hdept=scn.next();
					long temphour=scn.nextLong();
					tp= new TempEmployee(name,sno,hdept,temphour);
					emp[i]=tp;
					break;
			default: System.out.println("�ٹ� ���� ���� ���Է�");
			}
			
		}
		System.out.println("\n       �޿�����");
		for(Employee e:emp)
			System.out.println(e+"�޿���"+e.earnings());
	}

}
